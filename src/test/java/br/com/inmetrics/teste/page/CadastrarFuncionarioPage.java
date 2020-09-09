package br.com.inmetrics.teste.page;

import br.com.inmetrics.teste.support.DSL;

public class CadastrarFuncionarioPage {
	
	private DSL dsl;
	
	public CadastrarFuncionarioPage() {
		
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
		
		dsl.clicarBotao("//a[contains(text(),'Cadastre-se')]");
	}
	 
	public void ClicoMenuNovoFuncionario() {
		
		dsl.clicarBotao("//a[contains(text(),'Novo Funcionário')]");
	}
	
	public void InserirFuncionarioNomePage(String nome) {
		
		dsl.escrever("//input[@id='inputNome']", nome);
	}
	
	// OBS: Este campo esta dando erro no site da inmetrics na validacao do CPF que é uma funcao Javascript
	public void InserirFuncionarioCPFPage(String cpf) {
		
		dsl.escrever("//input[@id='cpf']", cpf);
	}
	
	public void SelecionarFuncionarioSexoPage(String option) {
		
		dsl.selecionarCombo("//select[@id='slctSexo']", option);
		
	}
	
	public void InserirFuncionarioAdmissao(String date) {
		
		dsl.escrever("//input[@id='inputAdmissao']", date);
	}
	
	public void InserirFuncionarioCargoPage(String cargo) {
		
		dsl.escrever("//input[@id='inputCargo']", cargo);
	}
	
	public void InserirFuncionarioSalarioPage(String salario) {
		
		dsl.escrever("//input[@id='dinheiro']", salario);
	}
	
	public void SelecionarFuncionarioContratacao(String tipoContratacao) {
		
		switch(tipoContratacao) {
			case "CLT": dsl.clicarRadio("//input[@id='clt']"); break;
			case "PJ":	dsl.clicarRadio("//input[@id='pj']"); break;
		}
	}
	
	public void ClicarBotaoSubmitQueryPage() {
		
		dsl.clicarBotao("//input[@class='cadastrar-form-btn' and @type='submit']");
	}
	
	// Validar futuramente
	public boolean ValidaMensagemCadastroSucessoPage() {
		
		return true;
	}
	
}
