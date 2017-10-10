import java.util.Scanner;
public class StoreUI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Store myStore = Repository.getStore();
		boolean keepGoing = true;
		while (keepGoing) {
			dislplayAisles(myStore.Aisles());
			System.out.println("Please type the aisle # of an aisle or type exit");
			String aisleSelect = scan.nextLine();
			if(!aisleSelect.equals("exit")) {
				if(validChoice(aisleSelect, myStore.Aisles().length)) {
					int aisleNumber = Integer.parseInt(aisleSelect) -1;
					displayProducts(myStore.Aisles()[aisleNumber].productList());
				}
			}	
		
			else if (aisleSelect.equals("exit")) {
				System.out.print("Goodbye");
			keepGoing = false;
			}
		}
	}

	private static boolean validChoice(String aisleSelect, int length) {
		int upperLimit = Repository.getListOfAisles().length;
		//TODO: Make sure aisleSelect is an Integer
		if (Integer.parseInt(aisleSelect) > 0 && Integer.parseInt(aisleSelect) < upperLimit +1) {
			
			return true;
		}
		else return false;
	}
	private static void dislplayAisles(Aisle[] theAisles) {
		for (int i =0; i < theAisles.length; i++) {
			System.out.print((i+1)+" Aisle - ");
			System.out.println(theAisles[i].aisleNuber());
		}
	}
	private static void displayProducts(Product[] theProducts) {
		System.out.println("SKU\tItem name\tPrice");
		for (Product item : theProducts) {
			System.out.print(item.SKU()+ "\t");
			System.out.print(item.description()+ "\t");
			System.out.println("$"+ item.price());
		}
	}
	
	
}
