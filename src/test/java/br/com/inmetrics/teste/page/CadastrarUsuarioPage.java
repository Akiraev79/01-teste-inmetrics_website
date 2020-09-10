package br.com.inmetrics.teste.page;

import br.com.inmetrics.teste.support.DSL;


public class CadastrarUsuarioPage {
	
	private DSL dsl;
	
	public CadastrarUsuarioPage(){
		
		dsl = new DSL();
	}
	
	/******* Page Login  ***********/	
	public void AcessarLinkSite(String url) {
		
		dsl.abrirLinkSite(url);
	}
	
	public void ClicarLinkCadastreSe() {
		
		dsl.clicarBotao("//a[contains(text(),'Cadastre-se')]");
	}
	
	/******* Page Cadastre-se ***********/
	
	public void InserirUsuarioPage(String usuario) {
		
		dsl.escrever("//input[@name='username']", usuario);
	}
	
	public void InserirSenhaPage(String senha) {
		
		dsl.escrever("//input[@name='pass']", senha);
	}
	
	public void InserirSenhaConfirmar(String senha) {
		
		dsl.escrever("//input[@name='confirmpass']", senha);
	}
	
	public void ClicarBotaoCadastrar() {
		
		dsl.clicarBotao("//button[@class='login100-form-btn']");
	}
	
	// Falta fazer esta validacão
	public boolean ValidaCadastroComSucesso () {
		
		return true;
		
	}
}
