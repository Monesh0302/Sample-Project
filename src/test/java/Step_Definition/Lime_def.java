package Step_Definition;

import Project_Limeroad.PageObjectManager;
import cucum_baseclass.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lime_def extends TestBase{
	
	PageObjectManager pom = new PageObjectManager();
	
	@Given("We can able to launch the {string} browser")
	public void we_can_able_to_launch_the_browser(String string) {
		browserLaunch(string);
	}

	@Given("we can able to launch the application URL {string}")
	public void we_can_able_to_launch_the_application_url(String string) {
		launchUrl(string);
	}

	@When("User can able to Mouse hover the Mens tab")
	public void user_can_able_to_mouse_hover_the_mens_tab() throws InterruptedException {
		moveToElement(pom.getTShirt_Product_E2E().getMens_Tab());
		Thread.sleep(5000);
		
	}

	@When("User can able to click the Polo T-Shirts")
	public void user_can_able_to_click_the_polo_t_shirts() {
		clickOnWebelement(pom.getTShirt_Product_E2E().getPolo_TShirts());
	}

	@When("User can able to select the T-Shirts")
	public void user_can_able_to_select_the_t_shirts() throws InterruptedException {
		Thread.sleep(3000);
		clickOnWebelement(pom.getTShirt_Product_E2E().getSelect_tshirt());
	}

	@When("User can able to click the Add to Cart button")
	public void user_can_able_to_click_the_add_to_cart_button() throws InterruptedException {
		clickOnWebelement(pom.getTShirt_Product_E2E().getQTY_Size());
		Thread.sleep(2000);
		clickOnWebelement(pom.getTShirt_Product_E2E().getAdd_cart_button());
		Thread.sleep(2000);
	}

	@Then("User can able to view the product in the Cart")
	public void user_can_able_to_view_the_product_in_the_cart() throws InterruptedException {
		clickOnWebelement(pom.getTShirt_Product_E2E().getClick_Logo());
		Thread.sleep(2000);
		clickOnWebelement(pom.getTShirt_Product_E2E().getClick_cart());
		Thread.sleep(2000);
		exit();		
	}

}
