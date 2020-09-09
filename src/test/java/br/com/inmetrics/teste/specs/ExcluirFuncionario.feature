#language: pt

@ExcluirFuncionario
Funcionalidade: Excluir Funcionario

Cenario: Excluir Funcionario com Sucesso
Quando Acesso o Site
E preencho campo Usuario e Senha
E clico em Entre
E clica no primeiro excluir da lista
Entao verifico a tela de empregados apresenta mensagem de exclusao feita com sucesso