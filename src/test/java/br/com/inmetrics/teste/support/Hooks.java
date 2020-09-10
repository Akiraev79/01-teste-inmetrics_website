package br.com.inmetrics.teste.support;

import static br.com.inmetrics.teste.support.DriverFactory.getDriver;
import static br.com.inmetrics.teste.support.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;

public class Hooks{
	
	@Rule
	public TestName testName = new TestName();
	
	@After
	public void finaliza ()throws IOException {
		
		// Captura a tela do navegador para evidencias
		TakesScreenshot ts =  (TakesScreenshot) getDriver();
		File arquivo = ts.getScreenshotAs(OutputType.FILE);
		// Como utilizo MAC OSX utilizo File.separator para não ter problema com separador de pastas do sistema operacional
		FileUtils.copyFile(arquivo,new File("target" + File.separator + "screenshots" + File.separator + testName.getMethodName() + ".jpg"));
		
		/* Fecha todas as abas do browser e instancias do driver */	
		if(Propriedades.CLOSE_BROWSER)
		{
			killDriver();
			
		}
		
	}
	
	
}