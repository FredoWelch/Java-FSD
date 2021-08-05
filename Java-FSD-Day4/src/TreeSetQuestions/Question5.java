package TreeSetQuestions;

import java.util.TreeSet;

public class Question5 {
	
	//5. Write a Java program to get the first and last elements in a tree set
	
	public static void main(String[] args) {
		
		TreeSet<String> ts5 = new TreeSet<>();
		
		ts5.add("Blue");
		ts5.add("Green");
		ts5.add("Black");
		ts5.add("Purple");
		
		
		System.out.println("First element: " + ts5.first()+"\nLast element: " + ts5.last());
		
	}
	

}
