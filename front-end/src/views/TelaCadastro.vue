<template lang="pug">
section.register-container
  .card
    .card-header
      h2 Cadastro

    .card-body
      form(@submit.prevent="handleNextStep")

        .form-group(v-if="step === 1")
          .floating-group
            input.form-control(type="text", v-model="form.name", required, placeholder=" ")
            label Nome

          .floating-group
            input.form-control(type="text", v-model="form.cpf", required, placeholder=" ")
            label CPF ou CNPJ

          .floating-group
            input.form-control(type="text", v-model="form.phone", required, placeholder=" ")
            label Telefone

        .form-group(v-if="step === 2")
          .floating-group
            input.form-control(type="email", v-model="form.email", required, placeholder=" ")
            label E-mail

          .floating-group
            input.form-control(type="password", v-model="form.password", required, placeholder=" ")
            label Senha

          .floating-group
            input.form-control(type="password", v-model="form.confirmPassword", required, placeholder=" ")
            label Confirmar Senha

        .form-group(v-if="step === 3")
          .floating-group
            input.form-control(type="text", v-model="form.cep", required, placeholder=" ")
            label CEP

          .floating-group
            input.form-control(type="text", v-model="form.logradouro", required, placeholder=" ")
            label Logradouro

          .floating-group
            input.form-control(type="text", v-model="form.numero", required, placeholder=" ")
            label Número

          .floating-group
            input.form-control(type="text", v-model="form.complemento", placeholder=" ")
            label Complemento

          .floating-group
            input.form-control(type="text", v-model="form.bairro", required, placeholder=" ")
            label Bairro

          .floating-group
            input.form-control(type="text", v-model="form.cidade", required, placeholder=" ")
            label Cidade

          .floating-group
            input.form-control(type="text", v-model="form.estado", required, placeholder=" ")
            label Estado

        .form-group(v-if="step === 4")
          .floating-group
            input.form-control(type="text", v-model="form.matricula", required, placeholder=" ")
            label Matrícula

          .floating-group
            select.form-control(v-model="form.tipoUsuario", required)
              option(value="") Selecione
              option(value="cliente") Cliente
              option(value="admin") Administrador
              option(value="tecnico") Técnico
            label Tipo de Usuário

          .floating-group
            select.form-control(v-model="form.tipoGenero", required)
              option(value="") Selecione
              option(value="masculino") Masculino
              option(value="feminino") Feminino
            label Gênero

        .form-actions
          button.btn.btn-secondary(type="button", v-if="step > 1", @click="step--") Voltar
          button.btn.btn-primary(type="submit") {{ step === 4 ? 'Cadastrar' : 'Próximo' }}
          a.btn.btn-link(href="#", @click.prevent="irParaLogin") Já tenho uma conta
</template>

<script>
export default {
  name: "TelaCadastro",
  data() {
    return {
      step: 1,
      form: {
        name: "",
        cpf: "",
        email: "",
        password: "",
        confirmPassword: "",
        phone: "",
        cep: "",
        logradouro: "",
        numero: "",
        complemento: "",
        bairro: "",
        cidade: "",
        estado: "",
        matricula: "",
        tipoUsuario: "",
        tipoGenero: ""
      }
    };
  },
  methods: {
    handleNextStep() {
      if (this.step === 2 && this.form.password !== this.form.confirmPassword) {
        alert("As senhas não coincidem!");
        return;
      }

      if (this.step < 4) {
        this.step++;
      } else {
        console.log("Cadastro finalizado:", this.form);
        alert("Cadastro concluído com sucesso!");
        this.$router.push('/login');
      }
    },
    irParaLogin() {
      alert("Ir para login");
    },
    async buscarEndereco(cep) {
      try {
        const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
        const data = await response.json();

        if (data.erro) {
          alert("CEP não encontrado.");
          return;
        }

        this.form.logradouro = data.logradouro;
        this.form.bairro = data.bairro;
        this.form.cidade = data.localidade;
        this.form.estado = data.uf;
      } catch (error) {
        alert("Erro ao buscar o endereço.");
        console.error(error);
      }
    }
  },
  watch: {
    'form.cep'(novoCep) {
      const cep = novoCep.replace(/\D/g, '');
      if (cep.length === 8) {
        this.buscarEndereco(cep);
      }
    }
  }
};
</script>

<style scoped>
.register-container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 105vh;
  background-color: #000;
  margin-top: -60px;
}

.card {
  background: #141414;
  border-radius: 20px;
  box-shadow: 0px 0px 22px 2px #ffd000;
  padding: 2rem;
  width: 100%;
  max-width: 800px;
  min-height: 60vh;
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
  margin-bottom: 2rem;
  width: 50%;
}

.floating-group input,
.floating-group select {
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
.floating-group input:not(:placeholder-shown) + label,
.floating-group select:focus + label,
.floating-group select:not([value=""]) + label {
  top: -0.6rem;
  font-size: 0.9rem;
}

.form-actions {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-top: 2rem;
  position: relative;
}

.btn {
  padding: 0.5rem 1rem;
  border: none;
  border-radius: 4px;
  font-weight: bold;
  cursor: pointer;
  transition: background 0.3s;
}

.btn-primary {
  background-color: #967e16;
  color: white;
  width: 200px;
  height: 40px;
}

.btn-primary:hover {
  background-color: #967e16b9;
}

.btn-secondary {
  background-color: #ccc;
  color: #000;
  width: 100px;
  height: 40px;
  margin-right: 10px;
}

.btn-link {
  background: none;
  color: #967e16;
  text-decoration: underline;
  position: absolute;
  right: 0;
  bottom: -30px;
}
</style>
