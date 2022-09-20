
import {createApp} from 'vue';
import Notifications from '@kyvg/vue3-notification';
import router from '@/router';
import App from './components/App.vue';
import i18n from './i18n';

import 'bootstrap/dist/js/bootstrap.js';

const main =(portletNamespace: string): void => {
    createApp(App)
        .use(router)
        .use(Notifications)
        .use(i18n)
        .mount(`#${portletNamespace}-1`);
};

export { main };