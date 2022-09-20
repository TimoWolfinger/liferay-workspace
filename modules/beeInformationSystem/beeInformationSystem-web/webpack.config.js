
/* eslint-disable */
const package = require('./package.json');
var path = require('path')
const publicPath = "/o/" + package.name + '-' + package.version + '/dist/',
    srcBasePath = "/src/main/resources/META-INF/resources/lib/",
    // from here on STATIC settings
    webpack = require('webpack'),
    {VueLoaderPlugin} = require('vue-loader'),
    { CleanWebpackPlugin } = require('clean-webpack-plugin'),
    TerserPlugin = require('terser-webpack-plugin'),
    { WebpackManifestPlugin } = require('webpack-manifest-plugin'),
    MiniCssExtractPlugin = require('mini-css-extract-plugin'),
    ESLintPlugin = require('eslint-webpack-plugin'),
    Dotenv = require('dotenv-webpack'),
    ForkTsCheckerWebpackPlugin = require('fork-ts-checker-webpack-plugin');

    /** 
      * imports style-dependencies of Bootstrap and DevExpress components
      * please modify as needed
      */
    function generateTheme () {
        let variableLoad = `
            @import "bootstrap/dist/css/bootstrap.min.css";
            @import "bootstrap";
            @import "devextreme/dist/css/dx.light.css";
        `;
        return variableLoad;
    }

    /**
     * 
     * main settings for webpack 
     */
    module.exports = (env, argv) => {
        return {
            entry: ["." + srcBasePath + 'index.ts'],
            output: {
                path: path.resolve(__dirname, './build/resources/main/META-INF/resources/dist/'),
                filename: '[name].js?id=[contenthash]',
                library: 'entryPoint',
                libraryTarget: 'var',
                publicPath: publicPath,
            },
            stats: {
                errorDetails: true
            },
            performance: {
                hints: false,
                maxEntrypointSize: 512000,
                maxAssetSize: 512000
            },
            cache: true,
            devServer: {
                hot: true,
                port: 8080,
                static: 
                {
                    directory: path.resolve(__dirname,'dev')
                },            
                historyApiFallback: true,
                proxy: {
                    '/openidm': {
                        target: 'https://siam-idm.dev.uni-s.de/openidm',
                        pathRewrite: { '^/openidm': '' },
                        changeOrigin: true
                    }
                }        
            },
            /*
                eslint fix-Option - fixes auto-fixable lint-errors on-the-fly if set to 'true'
                ATTENTION: modofies source-code!    
            */
            plugins: [
                new webpack.DefinePlugin({
                    __VUE_OPTIONS_API__: true,
                    __VUE_PROD_DEVTOOLS__: false,
                    __VUE_I18N_LEGACY_API__:false,
                    __VUE_I18N_FULL_INSTALL__:true
                }),
                new VueLoaderPlugin(),
                new CleanWebpackPlugin(),
                new webpack.BannerPlugin('Copyright 2021-22 University of Stuttgart, Germany'),
                new WebpackManifestPlugin({
                    fileName: "./build/resources/main/META-INF/resources/manifest.json"
                }),
                new MiniCssExtractPlugin({
                    filename: process.env.NODE_ENV === 'development' ? '[name].css' : '[name].css?id=[contenthash]',
                }),
                new ESLintPlugin({
                    extensions: ['ts', 'vue'],
                    fix: false
                }),
                new ForkTsCheckerWebpackPlugin(),
                new Dotenv({systemvars: true})
            ],
            optimization: {
                nodeEnv: argv.mode,
                minimize: argv.mode !== 'development',
                minimizer: [new TerserPlugin({})],
                removeAvailableModules: argv.mode !== 'development',
                removeEmptyChunks: argv.mode !== 'development',
                runtimeChunk: argv.mode === 'development' ? false : { name:`runtime`},
                emitOnErrors: false,
                splitChunks: argv.mode === 'development' ? false :  {
                    maxInitialRequests: Infinity,
                    minSize: 0,
                    cacheGroups: {
                        vendor: {
                            test: /[\\/]node_modules[\\/]/,
                            name: "vendor",
                            enforce: true,
                            chunks: 'all'
                        }
                    }
                }
            },
            devtool: argv.mode === 'production' ? 'source-map' : 'eval-cheap-module-source-map',
            mode: 'development',
            module: {
                rules: [            
                    {
                        test: /\.vue$/,
                        loader: 'vue-loader',
                    },
                    {
                        test: /\.(ts|tsx)$/,
                        loader: 'ts-loader',
                        exclude: /node_modules/,
                        options: {
                            transpileOnly: true,
                            appendTsSuffixTo: ['\\.vue$'],
                        }
                    },
                    {
                        test: /\.scss$/,
                        use: [
                            {
                                loader: MiniCssExtractPlugin.loader,                                
                            }, 
                            {
                                loader: "css-loader",
                                options: {
                                    sourceMap: true,
                                    esModule: false
                                } // translates CSS into CommonJS
                            }, {
                                loader: "sass-loader",
                                options: {
                                    sourceMap: true,
                                    additionalData: generateTheme()
                                } // compiles Sass to CSS
                            }]
                    },
                    {
                        test: /\.(png|jpe?g|gif|svg)$/i,
                        type: 'asset/resource',
                        generator: {
                            filename: 'assets/images/[name].[ext]',
                            publicPath: publicPath
                        }               
                    },
                    {
                        test: /\.(woff(2)?|ttf|eot)(\?v=\d+\.\d+\.\d+)?$/,
                        type: 'asset/resource',
                        generator: {
                            filename: 'assets/fonts/[name].[ext]',
                            publicPath: publicPath
                        }
                    }            
                ]
            },
            resolve: {
                extensions: ['.tsx', '.ts', '.js', '.vue', '.json'],
                alias: {
                    /* package of vue to be included - check if you need only runtime build or runtime + compiler build  */
                    'vue': "@vue/runtime-dom",       
                    '@': path.resolve(__dirname,srcBasePath)            
                },
                modules: [path.join(__dirname,srcBasePath), 'node_modules']      
            
            }
        };
    };