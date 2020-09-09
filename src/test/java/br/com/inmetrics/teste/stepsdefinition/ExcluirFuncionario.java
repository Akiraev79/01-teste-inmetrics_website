package br.com.inmetrics.teste.stepsdefinition;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ExcluirFuncionario {
	
	@Quando("^Acesso o Site$")
	public void AcessoSite()throws Throwable{
		
	}
	
	@E("^preencho campo Usuario e Senha$")
	public void PreencherUsuarioSenha() throws Throwable{
		
	}
	
	@E("^clico em Entre$")
	public void ClicarBotaoEntre() throws Throwable{
		
		
	}
	
	@E("^clica no primeiro excluir da lista$")
	public void ClicarPrimeiroExcluir() throws Throwable{
		
	}
	
	@Entao("^verifico a tela de empregados apresenta mensagem de exclusao feita com sucesso$")
	public boolean VerificarMensagemExclusaoSucesso() throws Throwable{
		
		return true;
	}

}
