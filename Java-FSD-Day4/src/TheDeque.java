import java.util.ArrayDeque;
import java.util.Deque;

public class TheDeque {
	
	  public static void main(String[] args) {

	        Deque<String> deque = new ArrayDeque<>();
	        deque.add("Mark");
	        deque.add("Paul");
	        deque.add("Watson");

	        for(String name: deque){
	            System.out.println(name);
	        }

	    }

}
