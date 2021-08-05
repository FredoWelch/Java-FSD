import java.util.Iterator;
import java.util.LinkedList;

public class TheLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Fred");
		names.add("Josh");
		names.add("Tim");
		
		Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
	}
}
