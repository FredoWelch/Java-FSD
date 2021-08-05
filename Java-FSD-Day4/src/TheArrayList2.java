import java.util.ArrayList;

public class TheArrayList2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Fred");
		names.add("Josh");
		names.add("Nick");
		
		System.out.println(names.get(1));
		
		
		names.set(1, "JD Loving");
		
		for(String name: names) {
			System.out.println(name);
		}
		
		
	}

}
