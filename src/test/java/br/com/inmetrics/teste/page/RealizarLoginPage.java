package br.com.inmetrics.teste.page;

import br.com.inmetrics.teste.support.DSL;

public class RealizarLoginPage {
	
	private DSL dsl;
	
	
	
	public RealizarLoginPage(){
		
		dsl = new DSL();
		
	}
	
	
	/******* campos ********/
	
	public void AcessarSiteLoginPage(String url) {
		
		dsl.abrirLinkSite(url);
	}
	
	public void InserirUsuarioPage(String usuario) {
		
		dsl.escrever("//input[@name='username']",usuario);
		
	}
	
	public void InserirSenhaPage(String senha) {
		
		dsl.escrever("//input[@name='pass']", senha);
	}
	
	/****** Botao *******/
	
	public void ClicarBotaoEntrePage () {
		
		dsl.clicarBotao("//button[@class='login100-form-btn']");
	}
	
	/******* valida pagina seguinte ***********/
	public boolean ValidaLoginSucessoPage(String url_listaEmpregados) {
		
		String URLJanela = (String) dsl.executaJS("document.write(window.location.host)\n");
		
		if(url_listaEmpregados == URLJanela) {
			return true;
		}else {
			return false;
		}
		
	}
	

}
