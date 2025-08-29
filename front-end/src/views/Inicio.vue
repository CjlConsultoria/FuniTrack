<template lang="pug">
  div.container
    section.hero
      nav.navbar
        ul
          li: a(href="#home") Home
          li: a(href="#servicos") Sobre
          li: a(href="#sobre") Serviços
          li: a(href="#contato") Contato
          li.menu-item
            router-link.btn.btn-login(to="/login") Login
          li.menu-item
            router-link.btn.btn-register(to="/cadastro") Registre-se

      h2 FUNILARIA <span>CJL</span>
      p Reparos rápidos, pintura de qualidade e atendimento confiável.

    section#servicos.servicos
      h3 Nossos <span>Serviços</span>
      p A Funilaria CJL é uma empresa especializada no processo de reparação, pintura e estética automotiva. <br>Sua criação se deu após anos de prestação de serviços para as grandes montadoras brasileira tanto para carros nacionais e importados. Com o tempo outras empresas no ramo de Blindagem agregaram conhecimento e, a partir daí surgiu a CJL Funilaria. <br><br>A alta exigência de qualidade nestas instituições moldaram a estrutura da CJL Funilaria onde as experiências passadas são aplicadas atualmente, mantendo um elevado grau de qualidade e satisfação de nossos clientes. <br><br>Além disto estamos sempre inovando e participando de tudo quanto é lançamento de novas tecnologias, onde trouxemos para nosso uso, técnicas, maquinários e produtos para o atendimento Express, onde dependendo do serviço há a possibilidade de ficar pronto em 3 horas.
      
      // Imagens lado a lado (vertical)
      div.Imagem-sobre
        img(src="@/assets/funilaria.webp" alt="Imagem 1")
      
      div.imagem-sobre2
        img(src="@/assets/funilaria2.jpg" alt="Imagem 2")

      div.imagem-sobre3
        img(src="@/assets/funilaria3.webp" alt="Imagem 2")

      div.botao-saiba-mais
        button Saiba mais!


    section#sobre.sobre
      h3 SERVIÇOS ESPECIALIZADOS

      .imagens-container
        .imagem-bloco
          h4 Funilaria
          img(src="@/assets/funilaria3.webp", alt="Funilaria")
          button Saiba mais
        .imagem-bloco
          h4 Pintura
          img(src="@/assets/funilaria2.jpg", alt="Pintura")
          button Saiba mais
        .imagem-bloco
          h4 Polimento
          img(src="@/assets/funilaria3.webp", alt="Polimento")
          button Saiba mais




    section#contato.contato
      h3 Fale Conosco
      .texto-contato
        p Se você tem dúvidas, sugestões, deseja solicitar um orçamento ou agendar um atendimento, nossa equipe está pronta para atendê-lo com atenção e agilidade. Preencha o formulário abaixo com suas informações e mensagem, e responderemos o mais breve possível. <br><br>Valorizamos cada contato e estamos sempre disponíveis para esclarecer qualquer questão relacionada aos nossos serviços. Seu retorno é fundamental para que possamos oferecer um atendimento cada vez melhor.
      form(@submit.prevent="enviarFormulario")
        label.label-nome(for="nome") Nome:
        input#nome(type="text" v-model="form.nome" placeholder="Seu nome" required)
        
        label.label-email(for="email") Email:
        input#email(type="email" v-model="form.email" placeholder="seu@email.com" required)
        
        label.label-mensagem(for="mensagem") Mensagem:
        textarea#mensagem(v-model="form.mensagem" placeholder="Descreva seu problema" required)
        
        button(type="submit") Enviar


    footer.footer
      p © 2025 Funilaria CJL. Todos os direitos reservados.
</template>


<script>
export default {
  name: 'InicioPage',
  data() {
    return {
      form: {
        nome: '',
        email: '',
        mensagem: ''
      }
    }
  },
  methods: {
    enviarFormulario() {
      console.log('Formulário enviado:', this.form)
      alert('Mensagem enviada com sucesso!')
      this.form.nome = ''
      this.form.email = ''
      this.form.mensagem = ''
    }
  }
}
</script>

<style scoped>
.container {
  font-family: Arial, sans-serif;
}


.header {
  background-color: transparent;
  color: white;
  padding: 20px;
  text-align: center;
  margin-top: -60px;
}

.navbar ul {
  list-style: none;
  display: flex;
  justify-content: end;
  gap: 40px;
  padding: 0;
  margin: 5px 0 0;
}

.navbar a {
  color: white;
  text-decoration: none;
  margin-top: -10px;
  font-size: 20px;
}

.navbar a:hover {
  color: #ffffff;
  transition: all .3s;
}

.hero {
  height: 95vh;
  background-image: url('@/assets/fundo.jpg');
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;
  color: white;
  position: relative;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  margin-top: -79px;
}

.navbar {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  display: flex;
  justify-content: flex-end;
  padding: 50px 40px;
  background: transparent;
  z-index: 2;
}

.hero::before {
  content: "";
  position: absolute;
  inset: 0;
  background: linear-gradient(to bottom, rgb(0, 0, 0), rgba(0, 0, 0, 0.658), transparent);
  z-index: 1;
}


.hero h2,
.hero p,
.navbar a {
  position: relative;
  z-index: 2;
}

.hero h2 {
  font-size: 60px;
  margin-bottom: 0;
}

.hero h2 span {
  color: #967e16;
  font-size: 60px;
}

.hero p {
  font-size: 20px;
  margin-bottom: 0;
}


.sobre, .contato {
  margin: 40px 0;
}

.sobre {
  background-color: #141414;
  height: 85vh;
  margin-top: -19px;
}

.sobre h3 {
  position: absolute;
  color: #967e16;
  font-size: 40px;
  margin-left: 150px;
  margin-top: 100px;
  padding-bottom: 10px;
}

.sobre h3::after {
  content: "";
  position: absolute;
  bottom: 0;               
  left: 22%;              
  transform: translateX(-50%);
  width: 250px;             
  border-bottom: 3px solid #967e16;
}

.imagens-container {
  display: flex;
  justify-content: center;
  gap: 40px;
  flex-wrap: wrap; 
}

.imagem-bloco {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 500px;
  margin-top: 200px;
}

.imagem-bloco img {
  width: 100%;
  height: auto;
  transition: transform 0.3s ease;
  border-radius: 0px;
}

.imagem-bloco img:hover {
  transform: scale(1.05);
}

/* Título */
.imagem-bloco h4 {
  margin-bottom: 10px;
  font-size: 25px;
  color: #ffffff;
  margin-right: 390px;
  font-weight: 200;
}

/* Botão */
.imagem-bloco button {
  margin-top: 20px;
  padding: 12px 16px;
  width: 150px;
  border: none;
  background-color: #967e16;
  color: #fff;
  cursor: pointer;
  font-weight: bold;
  border-radius: 4px;
  transition: background-color 0.2s ease;
  margin-right: 350px;
}

.imagem-bloco button:hover {
  background-color: #b2911c;
}


.servicos {
  background-color: #000;
  height: 100vh;
  margin-top: -50px;
}

.servicos h3 {
  position: absolute;
  font-size: 50px;
  margin-top: 150px;
  margin-left: 100px;
  color: #fff;
}

.servicos h3 span {
  color: #967e16;
}

.servicos p {
  margin-right: 1200px;
  position: absolute;
  margin-top: 250px;
  margin-left: 100px;
  font-size: 18px;
  color: #fff;
  font-weight: 200;
  text-align: left;
}

form {
  display: flex;
  flex-direction: column;
  gap: 10px;
  max-width: 400px;
  margin: auto;
  border: 2px solid #967e16;
  padding: 50px;
  border-radius: 20px;
  background-color: #141414;
  margin-left: 900px;
  height: 60%;
  margin-top: -340px;
  box-shadow: 2px 2px 20px 2px #fff;
}

input, textarea {
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 4px;
  background-color: #141414;
}

#mensagem {
  height: 100px;
}

.label-nome {
  margin-left: -350px;
}

.label-email {
  margin-left: -350px;
}

.label-mensagem {
  margin-left: -310px;
}

.contato h3 {
  position: absolute;
  font-size: 40px;
  font-weight: 200;
  margin-left: 800px;
  margin-top: -50px;
}

.contato button {
  background-color: transparent;
  color: white;
  border: none;
  padding: 10px;
  border-radius: 4px;
  cursor: pointer;
  margin-top: 50px;
  height: 50px;
  transition: .3s;
  border: 2px solid #967e16;
}

button:hover {
  background-color: #967e16;
}

.contato {
  position: relative;
  background-image: url("@/assets/fundo2.jpg");
  background-size: cover;
  background-position: center;
  padding: 100px 20px;
  color: #fff;
  z-index: 0;
  overflow: hidden;
  margin-top: -40px;
  height: 60vh;
}

.contato::before {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: linear-gradient(to bottom, rgba(0, 0, 0, 0.767), rgba(0, 0, 0, 0.774), transparent);
  z-index: -1;
}

.contato > * {
  position: relative;
  z-index: 1;
}

.texto-contato {
  max-width: 400px;
  text-align: left;
  color: #fff;
  font-size: 18px;
  font-weight: 200;
  line-height: 1.6;
  margin-bottom: 40px;
  position: relative;
  left: 25%;
  top: 10%;
}


.footer {
  text-align: center;
  padding: 20px;
  background-color: #141414;
  color: white;
  margin-top: 40px;
  margin-top: -40px;
}

.btn {
  text-decoration: none;
  padding: 7px 16px;
  border-radius: 4px;
  font-weight: 600;
  cursor: pointer;
  display: inline-block;
  border: 2px solid transparent;
  transition: background-color 0.3s ease, color 0.3s ease, border-color 0.3s ease;
}

.btn-login {
  color: #967e16;
  border-color: #967e16;
  background-color: transparent;
}

.btn-login:hover {
  background-color: #967e16;
  color: white;
}

.btn-register {
  color: white;
  background-color: #967e16;
  border-color: #967e16;
}

.btn-register:hover {
  background-color: #967e16c4;
  border-color: #967e16;
  color: #fff;
}

@keyframes bounce {
  0%, 100% {
    transform: translateY(0);
  }
  50% {
    transform: translateY(-20px);
  }
}

.Imagem-sobre img {
  margin-left: 200px;
  width: 500px;
  margin-top: 200px;
  border-radius: 20px 0 0 20px;
  box-shadow: 0px 0px 22px 2px #967e16;
  animation: bounce 2.5s infinite ease-in-out;
}

.imagem-sobre2 img {
  width: 500px;
  margin-top: -100px;
  margin-left: 1000px;
  border-radius: 0px 20px 20px 0px;
  box-shadow: 0px 0px 22px 2px #967e16;
  animation: bounce 1.5s infinite ease-in-out;
}

.imagem-sobre3 img {
  width: 500px;
  margin-top: -200px;
  margin-left: 200px;
  border-radius: 500PX;
  box-shadow: 0px 0px 22px 2px #967e16;
  animation: bounce 3s infinite ease-in-out;
}

.botao-saiba-mais {
  margin-left: -1130px;
  margin-top: -200px;
}

.botao-saiba-mais button {
  width: 300px;
  height: 50px;
  background-color: transparent;
  border: 2px solid #967e16;
  transition: .3s;
  font-size: 18px;
  font-weight: 600;
  color: #fff;
  cursor: pointer
}

.botao-saiba-mais button:hover {
  background-color: #967e16;
  color: #000;
  font-weight: 600;
}

</style>
