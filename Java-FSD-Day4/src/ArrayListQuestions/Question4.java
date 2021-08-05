package ArrayListQuestions;
import java.util.ArrayList;

public class Question4 {
	
	/* 4. Write a Java program to retrieve an element (at a specified index) 
	from a given array list. */
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Paul");
		names.add("Jake");
		names.add("Steve");
		names.add("Tom");
		
		System.out.println(names.get(2));
		
	}


}
