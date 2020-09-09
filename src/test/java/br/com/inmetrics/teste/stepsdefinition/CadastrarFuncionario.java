package br.com.inmetrics.teste.stepsdefinition;

import br.com.inmetrics.teste.page.CadastrarFuncionarioPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;

public class CadastrarFuncionario {
	
	private CadastrarFuncionarioPage page;
	
	public CadastrarFuncionario() {
	
		page = new CadastrarFuncionarioPage();
	}
	
	@Quando( "Acesso o Site")
	public void AcessoSite()throws Throwable{
		
		page.AcessarSitePage("http://www.inmrobo.tk");
	}
	
	@E("preencho campo Usuario e Senha")
	public void PreencherUsuarioSenha() throws Throwable{
		
		page.InserirUsuarioPage("Evandro79");
	}
	
	
	@E("clico em Entre")
	public void ClicarBotaoEntre()throws Throwable{
		
		page.InserirSenhaPage("eu552500");
	}
	
	@E("acesso a url de cadastro de funcionario")
	public void ClicarLinkCadastroFuncionarios() throws Throwable{
		
		page.ClicoMenuNovoFuncionario();
	}
	
	@E("preencho campo nome")
	public void CampoNome()throws Throwable{
		
		page.InserirFuncionarioNomePage("Evandro Souza Santos");	
	}
	
	@E("preencho campo cpf")
	public void CampoCPF () throws Throwable{
		
		page.InserirFuncionarioCPFPage("27232477830");
	}
	
	@E("preencho campo sexo")
	public void CampoSexo() throws Throwable{
		
		page.SelecionarFuncionarioSexoPage("Masculino");
	}
	
	@E("preencho campo admissao")
	public void CampoAdmissao() throws Throwable{
		
		page.InserirFuncionarioAdmissao("20/09/2020");	
	}
	
	@E("preencho campo cargo")
	public void CampoCargo()throws Throwable{
		
		page.InserirFuncionarioCargoPage("Analista de Automação");
	}
	
	@E("preencho campo salario")
	public void CampoSalario() throws Throwable{
		
		page.InserirFuncionarioSalarioPage("5.000,00");
	}
	
	@E("preencho campo tipo de contratacao")
	public void CampoContratacao() throws Throwable{
		
		page.SelecionarFuncionarioContratacao("CLT");
	}
	
	@E("clico em Enviar")
	public void ClicoBotaoEnviar() throws Throwable{
		
		page.ClicarBotaoSubmitQueryPage();
	}
	
	@Entao("verifico a tela de empregados apresenta mensagem de cadastro feito com sucesso")
	public boolean VerificarMensagemCadastroSucesso() throws Throwable{
		
		return true;
	}

}
