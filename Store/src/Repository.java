
public class Repository {
	public static Store getStore() {
		return new Store(" Place with Stuff", getListOfAisles());
	}

	public static Aisle[] getListOfAisles() {
		Aisle aisle1 = new Aisle( 1,  null, getProductsForAisle(1));
		Aisle aisle2 = new Aisle( 2, null, getProductsForAisle(2));
		Aisle aisle3 = new Aisle( 3, null, getProductsForAisle(3));
		return new Aisle[] {aisle1, aisle2, aisle3};
	}

	private static Product[] getProductsForAisle(int aisleNumber) {
		if (aisleNumber == 1) {
			
			Product item1 = new Product(101, "Thingy", 3.75f);
			Product item2 = new Product(102, "Dohicky", 7.88f);
			Product item3 = new Product(103, "Thing-A-mabobber", 800.02f);
			return new Product[] {item1, item2, item3};
		}
		if (aisleNumber == 2) {
			Product item1 = new Product(201, "Wachacallit", 8.75f);
			Product item2 = new Product(202, "Wiznob", 5.32f);
			Product item3 = new Product(203, "Wang-doodle", 20.02f);
			return new Product[] {item1, item2, item3};
		}
		if (aisleNumber == 3) {
		Product item1 = new Product(301, "Dingle-hopper", 10.00f);
		Product item2 = new Product(302, "Snarlax", 35.03f);
		Product item3 = new Product(303, "Randolmeter", 60.07f);
		return new Product[] {item1, item2, item3};
	    }
		return new Product[0];
	}
}
	

	

