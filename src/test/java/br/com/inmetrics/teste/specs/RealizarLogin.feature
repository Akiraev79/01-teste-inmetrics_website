#language: pt

@tag
Funcionalidade: Realizar login do Usuario

	Cenario: Realizar login do Usuario
		Quando Acesso o Site
		E preencho campo Usuario e Senha
		E clico em Entre
		Entao verifico se carregou a tela de empregados
