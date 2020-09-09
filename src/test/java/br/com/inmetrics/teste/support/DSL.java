package br.com.inmetrics.teste.support;

import static br.com.inmetrics.teste.support.DriverFactory.getDriver;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
	
	
	
	public void abrirLinkSite(String link) {
		
		getDriver().get(link);
		
	}
	
	/*********************************** TextBox ***********************************************/
	
	// Escreve nos campos de texto (OK)
	public void escrever(String xpath_campo, String texto) {
		
		getDriver().findElement(By.xpath(xpath_campo)).clear();
		getDriver().findElement(By.xpath(xpath_campo)).sendKeys(texto);
	}
	
	
	public void clicarBotao(String xpath) {
		
		getDriver().findElement(By.xpath(xpath)).click();
	}
	
	/************************************* RADIO BUTTON ******************************************/
	
	public void clicarRadio(String xpath) {
		
		getDriver().findElement(By.xpath(xpath)).click();	
	}
	
	/************************************* COMBOBOX **********************************************/
	
	// Seleciona corretamente a opção do comboBox conforme o texto visivel
	public void selecionarCombo(String xpath, String valor) {
		
		WebElement element = getDriver().findElement(By.xpath(xpath));
		
		Select combo = new Select(element);
		
		combo.selectByVisibleText(valor);
		
	}
	/********************************************** Validações Texto ******************************************/
	
	public String validaTextoTela(String xpath) {
		
		return getDriver().findElement(By.xpath(xpath)).getText();
	}
	
	
	public String AlertaObtertextoAceita() {
		
		Alert alert = getDriver().switchTo().alert();
		
		return alert.getText();
	}
	
	
	/************************************************ JavaScript ************************************************/
	
	public Object executaJS(String cmd, Object...param ) {
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
		return js.executeScript(cmd ,param);
		
		
	}
	
	
	

	
}
