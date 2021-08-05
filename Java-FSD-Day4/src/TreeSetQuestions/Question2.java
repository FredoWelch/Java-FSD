package TreeSetQuestions;

import java.util.TreeSet;

public class Question2 {
	
	//2. Write a Java program to iterate through all elements in a tree set.
	
	public static void main(String[] args) {
		
		TreeSet<String> ts2 = new TreeSet<>();
		
		ts2.add("Fish");
		ts2.add("Bear");
		ts2.add("Lion");
		ts2.add("Goat");
		
		for(String item: ts2) {
			System.out.println(item);
		}
	}


}
