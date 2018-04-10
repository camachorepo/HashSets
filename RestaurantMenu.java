import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class RestaurantMenu {
	
	public static void main(String[] args) {
		
		Map<String, Integer> menu = new HashMap<String, Integer> ();
		String addToOrder =  " ";
		String item = " ";
		int qty =0;
		Scanner sc = new Scanner(System.in);
		menu.put("Hamburgers", 0); 
		menu.put("Hot Dogs",  0);
		menu.put("Sandwiches",  0);
		menu.put("Fries",  0);
		menu.put("Soda",  0);
		System.out.println("HI here are the items on the menu");
		for(String s : menu.keySet())
		{
			System.out.println(s + " ");
		}
		while (!addToOrder.equals("N")){

			System.out.println("Would you like add to order (Y/N): ");
			addToOrder = sc.nextLine();
			if(addToOrder.equals("Y")) {
				System.out.println("Which item would you like to order : ");
				item = sc.nextLine();
				System.out.println("How many " + item + " would you like to order:");
				qty = sc.nextInt();
				sc.nextLine();
				if(!menu.containsKey(item)) {
					System.out.println("You ordered off the menu please re-order");
				}
				else 
				{
					menu.put(item, menu.get(item) + qty);
				}
				
			}
			
		}
		
		viewOrder(menu);
		
	}
	
	
	public static void viewOrder(Map <String, Integer> order) {
		
		
		System.out.println("	Order 	");
		System.out.println("Item     Quantity");
		
		for(Map.Entry<String, Integer> i : order.entrySet()) {
			
			System.out.print(i.getKey());
			System.out.print("      " + i.getValue());
			System.out.println();
			
		}
		
	}

}
