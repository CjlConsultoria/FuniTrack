import { createApp } from 'vue'
import App from './App.vue'
import router from './router' // importa o router

createApp(App).use(router).mount('#app') // registra o router
