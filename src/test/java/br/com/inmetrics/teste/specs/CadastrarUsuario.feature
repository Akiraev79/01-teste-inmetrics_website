#language: pt

@CadastrarUsuario
Funcionalidade: Cadastrar Usuario

Cenario: Cadastrar Usuario com Sucesso
Quando acesso a url de cadastro
E preencho campos Usuario, Senha e Confirmar Senha
E clico em Cadastrar
Entao verifico se carregou a tela de login