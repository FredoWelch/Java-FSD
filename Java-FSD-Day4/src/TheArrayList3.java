import java.util.ArrayList;

public class TheArrayList3 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Fred");
	    names.add("Paul");
	    names.add("Nick");
	    names.add("Watson");
	    
	    for (int i = 0; i>names.size(); i++) {
	    	System.out.println(names.get(i));
	    }
	    
	    names.forEach(name ->{
	    	
	    	System.out.println(name);
	    	
	    });

		
	}
	

	
}
