package TreeSetQuestions;

import java.util.TreeSet;

public class Question1 {
	
	//Write a Java program to create a new tree set, add some colors (string) 
	//and print out the tree set. 
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("Blue");
		ts.add("Red");
		ts.add("Green");
		ts.add("White");
		
		System.out.println(ts);
	}


}
