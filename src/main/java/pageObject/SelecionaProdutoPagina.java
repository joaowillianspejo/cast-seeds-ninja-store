package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelecionaProdutoPagina extends ClasseBasePageObject{
	
	@FindBy(xpath="//*/a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=20']")
	private WebElement linkMenu;
	
	public SelecionaProdutoPagina(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selecionaProduto() {
		
		new Actions(driver).moveToElement(linkMenu).perform();
	}
}