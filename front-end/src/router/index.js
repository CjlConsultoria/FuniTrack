import { createRouter, createWebHistory } from 'vue-router'
import Inicio from '@/views/Inicio.vue'
import TelaLogin from '@/views/TelaLogin.vue'
import TelaCadastro from '@/views/TelaCadastro.vue'

const routes = [
  { path: '/', name: 'Inicio', component: Inicio },
  { path: '/login', name: 'TelaLogin', component: TelaLogin },
  { path: '/cadastro', name: 'TelaCadastro', component: TelaCadastro }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
