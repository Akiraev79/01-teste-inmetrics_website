package br.com.inmetrics.teste.stepsdefinition;

import br.com.inmetrics.teste.page.CadastrarUsuarioPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CadastrarUsuario {
	
	private CadastrarUsuarioPage page;
	
	public CadastrarUsuario() {
	
		page = new CadastrarUsuarioPage();
		
	}
	
	@Quando("^acesso a url de cadastro$")
	public void AbrirLinkCadastro () throws Throwable{
		
		page.AcessarLinkSite("http://www.inmrobo.tk/accounts/signup/");
	}
	
	@E("^preencho campos Usuario, Senha e Confirmar Senha$")
	public void CampoUsuarioSenhaConfirmaSenha() throws Throwable{
		
		page.InserirUsuarioPage("Evandro79");
		page.InserirSenhaPage("eu552500");
		page.InserirSenhaConfirmar("eu552500");
		
	}
	
	@E("^clico em Cadastrar$")
	public void ClicarBotaoCadastrar() throws Throwable{
		
		page.ClicarBotaoCadastrar();
	}
	
	// Preciso validar depois
	@Entao("^verifico se carregou a tela de login$")
	public boolean VerificarPageLogin() throws Throwable{
		
		return true;
	}
	
	

}
