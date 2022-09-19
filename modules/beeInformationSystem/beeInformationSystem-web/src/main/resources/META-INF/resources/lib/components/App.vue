<template>
  <div>
    <router-view />
  </div>
</template>
<script setup lang='ts'>
import { provide } from 'vue';
import { useI18n } from 'vue-i18n';

const { t } = useI18n();
provide('t', t);
 
</script>
