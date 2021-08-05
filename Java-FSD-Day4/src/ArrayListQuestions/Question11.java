package ArrayListQuestions;
import java.util.ArrayList;
import java.util.Collections;

public class Question11 {
	
	// 11. Write a Java program to reverse elements in a array list. 
	
	public static void main(String[] args) {
		ArrayList<String> states = new ArrayList<>();
		
		states.add("New York");
		states.add("Cali");
		states.add("Texas");
		states.add("Arizona");
		System.out.println(states);
		
		Collections.reverse(states);
		System.out.println(states);
	}
	


}
