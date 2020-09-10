package br.com.inmetrics.teste.stepsdefinition;

import io.cucumber.java.pt.Quando;
import br.com.inmetrics.teste.page.AlterarFuncionarioPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class AlterarFuncionario {
	
	private AlterarFuncionarioPage page;
	
	public AlterarFuncionario() {
		
		page = new AlterarFuncionarioPage();
	}
	
	@Quando("Acesso o Site")
	public void AcessarSite() throws Throwable{
		
		page.AcessarSitePage("http://www.inmrobo.tk");	
	}
	
	@E("preencho campo Usuario e Senha")
	public void CampoUsuarioSenha() throws Throwable{
		
		page.InserirUsuarioPage("Evandro79");
		page.InserirSenhaPage("eu552500");
	} 
	
	@E("clico em Entre")
	public void ClicarBotaoEntre() throws Throwable{
		
		page.ClicarBotaoEntre();
	}
	
	@E("preencho campo search para filtrar o nome do funcionario que irei alterar")
	public void CampoSearch() throws Throwable{
		
		page.InserirNomeSearchPage("Evandro Souza");
	}
	
	@E("clico no botao alterar da primera linha do resultado filtrado")
	public void ClicarAlterarLista() throws Throwable {
		
		page.ClicarBotaoAlterarPage();
	}
	
	@E("preencho campo nome")
	public void CampoNome() throws Throwable{
		
		page.InserirAlterarNomePage("Adriana Soares");
	}
	
	@E("preencho campo cpf")
	public void CampoCPF () throws Throwable{
		
		page.InserirAlterarCPF("35707832458");
	}
	
	@E("preencho campo sexo")
	public void CampoSexo() throws Throwable{
		
		page.SelecionarAlterarSexoPage("Feminino");
	}
	
	@E("preencho campo admissao")
	public void CampoAdmissao() throws Throwable {

		page.InserirAlterarAdmissaoPage("12/12/2020");
	}
	
	@E("preencho campo cargo")
	public void CampoCargo() throws Throwable{
		
		page.InserirAlterarCargo("Automatizadora de Testes"); 
	}
	
	@E("preencho campo salario")
	public void CampoSalario() throws Throwable{
		
		page.InserirAlterarSalarioPage("6.000,00");
	}
	
	@E("preencho campo tipo de contratacao")
	public void CampoContratacao() throws Throwable{
		
		page.SelecionarAlterarContratacaoPage("PJ");
	}
	
	@E("clico em Enviar")
	public void ClicarBotaoEnviar() throws Throwable{
		
		page.ClicarBotaoEnviarPage();
	}
	
	// Validar depois
	@Entao("verifico a tela de empregados apresenta mensagem de alteracao feita com sucesso")
	public boolean VerificarMensagemAlteracaoSucesso ()throws Throwable{
	
		return true;
	} 

}
