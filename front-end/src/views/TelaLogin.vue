<template lang="pug">
section.login-container
  .card
    .card-header
      h2 Faça seu Login

    .card-body
      form(@submit.prevent="handleLogin")
        .form-group
          .floating-group
            input#email.form-control(type="email", v-model="email", required, placeholder=" ")
            label(for="email") E-mail

        .form-group
          .floating-group
            input#password.form-control(type="password", v-model="password", required, placeholder=" ")
            label(for="password") Senha

        .form-actions
          button.btn.btn-primary(type="submit") Entrar
          h2 Funilaria <br> 
            span CJL
          a.btn.btn-link(href="#", @click.prevent="irParaRecuperarSenha") Esqueci minha senha

        .cadastro
          h2 Cadastra-se
          p Não tem uma conta ainda? faça o cadastro aqui!
          a.btn.btn-link(href="#", @click.prevent="irParaCadastro") Fazer cadastro
</template>

<script>
export default {
  name: "TelaLoginPage",
  data() {
    return {
      email: '',
      password: ''
    };
  },
  methods: {
    handleLogin() {
      console.log('Login com', this.email, this.password);
    },
    irParaRecuperarSenha() {
      console.log('Redirecionar para recuperação de senha');
    },
    irParaCadastro() {
      console.log('Redirecionar para cadastro');
    }
  }
};
</script>

<style scoped>
.login-container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 105vh;
  background-color: #000;
  margin-top: -80px;
}

.card {
  background: #141414;
  border-radius: 20px;
  box-shadow: 0px 0px 22px 2px #967e16;
  padding: 2rem;
  width: 100%;
  max-width: 800px;
  height: 50vh;
}

.card-header {
  text-align: center;
  margin-bottom: 1.5rem;
}

.card-header h2 {
  color: #fff;
}

.form-group {
  margin-bottom: 1rem;
  text-align: left;
}

.floating-group {
  position: relative;
  width: 50%;
  margin-bottom: 1.5rem;
}

.floating-group input {
  width: 100%;
  padding: 1.2rem 0.75rem 0.5rem;
  border: 1px solid #ccc;
  border-radius: 4px;
  background: transparent;
  color: white;
  font-size: 1rem;
}

.floating-group label {
  position: absolute;
  top: -0.6rem;
  left: 0.75rem;
  background-color: #141414;
  padding: 0 0.3rem;
  color: #967e16;
  font-size: 0.9rem;
  pointer-events: none;
  transition: 0.2s;
}

.floating-group input:focus + label,
.floating-group input:not(:placeholder-shown) + label {
  top: -0.6rem;
  font-size: 0.9rem;
}

.form-actions {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-top: 1rem;
  position: relative;
}

.btn {
  padding: 0.5rem 1rem;
  border: none;
  border-radius: 4px;
  font-weight: bold;
  cursor: pointer;
  transition: background 0.3s;
  position: relative;
}

.btn-primary {
  background-color: #967e16;
  color: white;
  width: 425px;
  height: 40px;
}

.btn-primary:hover {
  background-color: #967e16b9;
}

.btn-link {
  background: none;
  color: #967e16;
  text-decoration: underline;
  margin-left: -15px;
  margin-top: 90px;
  position: absolute;
}

.form-actions h2 {
  font-size: 50px;
  color: #fff;
  margin-top: -200px;
  margin-left: 500px;
  position: absolute;
}

.form-actions h2 span {
  color: #967e16;
}

.cadastro {
  color: #fff;
}

.cadastro h2 {
  margin-left: -715px;
  margin-top: 50px;
  font-size: 15px;
}

.cadastro p {
  margin-left: -455px;
}

.cadastro a {
  margin-top: 0px;
  margin-left: -415px;
}
</style>
