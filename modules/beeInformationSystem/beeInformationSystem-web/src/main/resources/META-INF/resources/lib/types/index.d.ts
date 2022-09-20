import RouteConfig from 'vue-router';
import {TranslateResult} from 'vue-i18n';
declare module 'bootstrap-vue'
declare module 'vue-property-decorator';
declare module 'vue-class-component';
declare module 'vue/types/vue'
declare module 'User';

declare module 'routes.ts'{
    const routes:Array<RouteConfig>;
    export default routes;
}

/* eslint-disable no-unused-vars */
type TranslationFunction = (arg: string) => TranslateResult;