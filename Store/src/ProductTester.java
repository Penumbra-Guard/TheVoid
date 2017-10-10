
public class ProductTester {

	public static void main(String[] args) {
		Product myProduct = new Product(1, "Thingy", 3.75f);
		System.out.println(myProduct.SKU());
		System.out.println(myProduct.price());
		
		
	}
	private static Product[] listOfInventory() {
		Product[] Items;
		Product item1 = new Product(1, "Thingy", 3.75f);
		Product item2 = new Product(2, "Dohicky", 7.88f);
		Product item3 = new Product(3, "Thing-A-mabobber", 800.02f);
		Items = new Product [] {item1, item2, item3};
		return Items; 


	

	}
}	