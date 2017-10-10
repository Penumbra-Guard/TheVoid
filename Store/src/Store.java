
public class Store {
	private String storeName;
	private Aisle[] aisles;
	
	public Store(String storeName, Aisle[] listOfAisles) {
		this.storeName = storeName;
		this.aisles = listOfAisles;
	}
	public String storeName() {
		return this.storeName;
	}
	public Aisle[] Aisles() {
		return this.aisles;
	}

}
