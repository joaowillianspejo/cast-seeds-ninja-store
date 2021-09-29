package teste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuracoes.Configuracoes;

public class ClasseBaseTeste {
	protected WebDriver driver;
	
	public void iniciaAplicacao() {
		System.setProperty(Configuracoes.NOME_DRIVER, Configuracoes.CAMINHO_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Configuracoes.URL_APLICACAO);
	}
}
