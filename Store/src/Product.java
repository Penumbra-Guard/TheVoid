public class Product {  
		 
	private int SKU;
	private String description;
	private float price;
	
	public Product( int SKU, String description, float price) {
		this.SKU = SKU;
		this.description = description;
		this.price = price;
		
	}
	public int SKU() {
		return  this.SKU;
	}
	public String description() {
		return  this.description;
	}
	public float price() {
		return this.price;
	}
}