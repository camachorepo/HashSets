import java.util.HashMap;
import java.util.Map;

public class ColorKey {

	public static void main(String[] args) {
		HashMap<Integer, String> colors = new HashMap<Integer, String>();
		
		colors.put(1, "Red"); 
		colors.put(2, "Blue"); 
		colors.put(3, "Yellow");
		colors.put(4, "Orange");
		colors.put(5,"Black");
		
		for(Integer i : colors.keySet()) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(String s : colors.values()) {
			
			System.out.print(s + " ");
			
		}
		
		colors.put(4, "Green");
		
		// ouput for orange is changed for green because each key value set in a map must be unique 
		for(Integer i : colors.keySet()) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(String s : colors.values()) {
			
			System.out.print(s + " ");
			
		}
		
		System.out.println();
		
		for(int i=1; i <= colors.size(); i++ ) {
			
			System.out.println(i + " - " + colors.get(i));
			
		}
		
		for(Map.Entry<Integer, String> i : colors.entrySet())
		{
			System.out.println(i.getValue() + " - " + i.getKey());
			
		}
		
	}
	
	
}
