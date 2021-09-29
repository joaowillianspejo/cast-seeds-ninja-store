package teste;

import org.junit.Before;
import org.junit.Test;

import pageObject.SelecionaProdutoPagina;

public class CompraProdutoTeste extends ClasseBaseTeste{
	private SelecionaProdutoPagina selecionaProduto;
	
	@Before
	public void antesDoTeste() {
		iniciaAplicacao();
		selecionaProduto = new SelecionaProdutoPagina(driver);
	}
	
	@Test
	public void compraProduto() {
		selecionaProduto.selecionaProduto();
	}
}
