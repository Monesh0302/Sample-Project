package Project_Limeroad;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import cucum_baseclass.TestBase;

public class Product_TShirt extends TestBase{
	
	public Product_TShirt() {
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath = "//a[@id='men_category']")
	private WebElement Mens_Tab;

	public WebElement getMens_Tab() {
		return Mens_Tab;
	}
	
	@FindBy(xpath = "(//span[text()='Polo T Shirts'])[1]")
	private WebElement Polo_TShirts;

	public WebElement getPolo_TShirts() {
		return Polo_TShirts;
	}
	
	@FindBy(xpath="//a[@class='dB pR taC ldr gtm-p h412 bs oH phref']//following-sibling::img[@id='11299825']")
	private WebElement select_tshirt;

	public WebElement getSelect_tshirt() {
		return select_tshirt;
	}
	
	@FindBy(xpath="//span[@id='size_25417961']")
	private WebElement QTY_Size;

	public WebElement getQTY_Size() {
		return QTY_Size;
	}
	
	@FindBy(xpath="//div[text()='ADD TO CART']")
	private WebElement Add_cart_button;

	
	public WebElement getAdd_cart_button() {
		return Add_cart_button;
	}

	@FindBy(xpath="//div[@class='lLogo dIb vM']")
	private WebElement click_Logo;

	public WebElement getClick_Logo() {
		return click_Logo;
	}
	
	@FindBy(xpath="//div[@id='DesktopCart']")
	private WebElement click_cart;

	public WebElement getClick_cart() {
		return click_cart;
	}

}
