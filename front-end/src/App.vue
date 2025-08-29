<template>
  <div id="app">
    <nav v-if="mostrarNavbar">
      <router-link to="/">Início</router-link>
      <router-link to="/login">Login</router-link>
    </nav>

    <router-view />
  </div>
</template>

<script>
import { computed } from 'vue'
import { useRoute } from 'vue-router'

export default {
  name: 'App',
  setup() {
    const route = useRoute()

    const mostrarNavbar = computed(() => {
      // Esconder navbar nas páginas de login e cadastro
      return !['TelaLogin', 'TelaCadastro'].includes(route.name)
    })

    return {
      mostrarNavbar
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
