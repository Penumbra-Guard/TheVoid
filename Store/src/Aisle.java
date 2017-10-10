
public class Aisle {
	private int aisleNumber;
	private String aisleDescription;
	private Product[] listOfInventory;
	
	public Aisle( int aisleNumber, String aisleDescription, Product[] productsInAisle) {
		this.aisleNumber = aisleNumber;
		this.aisleDescription = aisleDescription;
		this.listOfInventory = productsInAisle;
		
	}
	public int aisleNuber() {
		return this.aisleNumber;
	}
	public String aisleDescription() {
		return this.aisleDescription;
	}
	public Product[] productList() {
		return this.listOfInventory;
	}

}
