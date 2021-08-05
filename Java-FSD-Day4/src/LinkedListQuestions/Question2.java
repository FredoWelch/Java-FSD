package LinkedListQuestions;

import java.util.LinkedList;

public class Question2 {
	
	//2. Write a Java program to iterate through all elements in a linked list. 
	
	public static void main(String[] args) {
		
		LinkedList<String> ll2 = new LinkedList<>();
		
		ll2.add("one");
		ll2.add("Tree");
		ll2.add("Water");
		
		for(String item: ll2) {
			System.out.println(item);
		}
	}
	
	


}
