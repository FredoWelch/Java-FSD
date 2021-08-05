package ArrayListQuestions;
import java.util.ArrayList;
import java.util.Collections;

public class Question13 {
	
	// 13. Write a Java program of swap two elements in an array list.
	
	public static void main(String[] args) {
		
		ArrayList<String> places = new ArrayList<>();
		
		places.add("Beach");
		places.add("Mall");
		places.add("Casino");
		places.add("Park");
		System.out.println(places);
		
		
		Collections.swap(places, 2, 0);
		System.out.println(places);
	
		
	}
	
	
	


}
