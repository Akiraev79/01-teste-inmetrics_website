package br.com.inmetrics.teste.runner;		

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(CucumberOptions.class)				
@CucumberOptions(features="br.com.inmetrics.teste.specs", glue={""}, dryRun=false)		

public class RunCucumberTest 				
{		

}