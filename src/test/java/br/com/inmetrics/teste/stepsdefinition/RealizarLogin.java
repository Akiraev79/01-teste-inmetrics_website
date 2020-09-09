package br.com.inmetrics.teste.stepsdefinition;

import br.com.inmetrics.teste.page.RealizarLoginPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;


public class RealizarLogin {
	
	private RealizarLoginPage page;
	
	public RealizarLogin () {
		
		page = new RealizarLoginPage();
	}
	
	@Quando("Acesso o Site")
	public void Acessar_Site () throws Throwable{
		
		page.AcessarSiteLoginPage("http://www.inmrobo.tk");
	}
	
	@E("preencho campo Usuario e Senha")
	public void Preencher_campo_usuario () throws Throwable{
		
		page.InserirUsuarioPage("Evandro79");
		page.InserirSenhaPage("eu552500");
		
	}

	@E("clico em Entre")
	public void ClicarEnter() throws Throwable{
	
		page.ClicarBotaoEntrePage();
	}

	@Entao("verifico se carregou a tela de empregados")
	public boolean Verificar_tela_empregado () throws Throwable{
		
		return page.ValidaLoginSucessoPage("http://www.inmrobo.tk/empregados/");
		
	}

}
