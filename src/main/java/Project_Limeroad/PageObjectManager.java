package Project_Limeroad;

public class PageObjectManager {
	
	private Product_TShirt TShirt_Product_E2E;

	public Product_TShirt getTShirt_Product_E2E() {
		
		TShirt_Product_E2E= new Product_TShirt();
		
		return TShirt_Product_E2E;
	}
	
	private static PageObjectManager pom;

	public static PageObjectManager getPom() {
		pom = new PageObjectManager();
		
		return pom;
	}
	
	

}
