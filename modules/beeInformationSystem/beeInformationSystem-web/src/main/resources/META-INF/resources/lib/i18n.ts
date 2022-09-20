import en from './locales/en.json';
import de from './locales/de.json';
import { createI18n } from 'vue-i18n';
const locale = 'de',
    fallbackLocale = 'de',
    messages = {
        en: en,
        de: de    
    },
    i18n = createI18n({
        legacy: false,
        locale: locale,
        fallbackLocale: fallbackLocale,
        messages
    });

export default i18n;