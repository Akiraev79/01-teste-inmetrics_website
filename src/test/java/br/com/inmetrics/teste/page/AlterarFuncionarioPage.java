package br.com.inmetrics.teste.page;

import br.com.inmetrics.teste.support.DSL;

public class AlterarFuncionarioPage {
	
	private DSL dsl;
	
	public AlterarFuncionarioPage() {
		
		dsl = new DSL();	
	}
	
	public void AcessarSitePage(String url) {
		
		dsl.abrirLinkSite(url);
	}
	
	public void InserirUsuarioPage(String usuario) {
		
		dsl.escrever("//input[@name='username']", usuario);
	}
	
	public void InserirSenhaPage(String senha) {
		
		dsl.escrever("//input[@name='pass']", senha);
	} 
	
	public void ClicarBotaoEntre() {
		
		dsl.clicarBotao("//button[@class='login100-form-btn']");
	}
	
	public void InserirNomeSearchPage(String nomeSearch) {
		
		dsl.escrever("//label[contains(text(),'Pesquisar:')]//input", nomeSearch);
	}
	
	public void ClicarBotaoAlterarPage() {
		
		dsl.clicarBotao("//tr[1]//td[6]//a[2]//button[1]");
	}
	
	public void InserirAlterarNomePage(String nome) {
		
		dsl.escrever("//input[@id='inputNome']", nome);
	}
	
	public void InserirAlterarCPF(String cpf) {
		
		dsl.escrever("//input[@id='cpf']", cpf);
	}
	
	public void SelecionarAlterarSexoPage(String sexo) {
		 
		dsl.selecionarCombo("//select[@id='slctSexo']", sexo);
	}
	
	public void InserirAlterarAdmissaoPage(String date) {
		
		dsl.escrever("//input[@id='inputAdmissao']", date);
	}
	
	public void InserirAlterarCargo(String cargo) {
		
		dsl.escrever("//input[@id='inputCargo']", cargo);
	}
	
	public void InserirAlterarSalarioPage(String salario) {
		
		dsl.escrever("//input[@id='dinheiro']", salario);
	}
	
	public void
	
	

}

/*
E preencho campo tipo de contratacao
E clico em Enviar
Entao verifico a tela de empregados apresenta mensagem de alteracao feita com sucesso 
 */
