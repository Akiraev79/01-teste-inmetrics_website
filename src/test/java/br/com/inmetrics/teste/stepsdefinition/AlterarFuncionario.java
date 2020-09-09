package br.com.inmetrics.teste.stepsdefinition;

import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class AlterarFuncionario {
	
	@Quando("Acesso o Site")
	public void AcessarSite() throws Throwable{
		
	}
	
	@E("preencho campo Usuario e Senha")
	public void CampoUsuarioSenha() throws Throwable{
		
	} 
	
	@E("clico em Entre")
	public void ClicarBotaoEntre() throws Throwable{
		
	}
	
	@E("preencho campo search para filtrar o nome do funcionario que irei alterar")
	public void CampoSearch() throws Throwable{
		
		
	}
	
	@E("clico no botao alterar da primera linha do resultado filtrado")
	public void ClicarAlterarLista() throws Throwable {
		
	}
	
	@E("preencho campo nome")
	public void CampoNome() throws Throwable{
		
	}
	
	@E("preencho campo cpf")
	public void CampoCPF () throws Throwable{
		
	}
	
	@E("preencho campo sexo")
	public void CampoSexo() throws Throwable{
		
		
	}
	
	@E("preencho campo admissao")
	public void CampoAdmissao() throws Throwable {

		
	}
	
	@E("preencho campo cargo")
	public void CampoCargo() throws Throwable{
		
	}
	
	@E("preencho campo salario")
	public void CampoSalario() throws Throwable{
		
	}
	
	@E("preencho campo tipo de contratacao")
	public void CampoContratacao() throws Throwable{
		
	}
	
	@E("clico em Enviar")
	public void ClicarbotaoEnviar() throws Throwable{
		
	}
	
	@Entao("verifico a tela de empregados apresenta mensagem de alteracao feita com sucesso")
	public boolean VerificarMensagemAlteracaoSucesso ()throws Throwable{
	
		return true;
	} 

}
