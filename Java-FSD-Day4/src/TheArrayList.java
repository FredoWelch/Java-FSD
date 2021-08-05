import java.util.ArrayList;
import java.util.Iterator;

public class TheArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("Fred");
		myList.add("Josh");
		myList.add("Nick");
		
		//System.out.println(myList);
		
		
		Iterator iterator = myList.iterator();
		
		//while(iterator.hasNext()) {
			//System.out.println(iterator.next());
	//}
			
			for(String name: myList) {
				System.out.println(name);
			}
		}
	}


