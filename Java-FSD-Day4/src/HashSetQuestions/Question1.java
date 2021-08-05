package HashSetQuestions;

import java.util.HashSet;



public class Question1 {
	
	//1. Write a Java program to append the specified element to the end of a hash set. 
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("One");
		hs.add("Two");
		hs.add("Five");
		hs.add("Four");
		System.out.println(hs);
		
		hs.add("Three");
		System.out.println(hs);
		
		
	}


}
