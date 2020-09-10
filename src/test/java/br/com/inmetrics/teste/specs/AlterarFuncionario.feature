 #language: pt

@AlterarFuncionario
Funcionalidade: Alterar Funcionario

Cenario: Alterar Funcionario com Sucesso
Quando Acesso o Site
E preencho campo Usuario e Senha
E clico em Entre
E preencho campo search para filtrar nome do funcionario que irei alterar
E clico no botao alterar da primera linha do resultado filtrado
E preencho campos nome, cpf, sexo, admissao, cargo, salario e tipo contratação
E clico em Enviar
Entao verifico tela de empregados mostra mensagem alteracao feita com sucesso