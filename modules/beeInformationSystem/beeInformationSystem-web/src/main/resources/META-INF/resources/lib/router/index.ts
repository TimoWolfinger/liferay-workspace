import { createRouter, createWebHashHistory, RouteRecordRaw } from 'vue-router';

const routes: Array<RouteRecordRaw> = [
    {
        path: '/',
        component: ():Promise<typeof import('*.vue')> => import('@/components/HelloWorld.vue'), name: 'HelloWorld1'        
    }
],
    router = createRouter({
        history: createWebHashHistory(),
        routes
    });

export default router;