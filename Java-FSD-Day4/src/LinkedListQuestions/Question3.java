package LinkedListQuestions;

import java.util.Iterator;
import java.util.LinkedList;

public class Question3 {
	
	//3. Write a Java program to iterate through all elements 
	//in a linked list starting at the specified position. 
	
	public static void main(String[] args) {
		
		LinkedList ll3 = new LinkedList<>();
		
		ll3.add("Duck");
		ll3.add("Cat");
		ll3.add("Cow");
		ll3.add("Goose");
		ll3.add("Rat");
		
		Iterator i = ll3.listIterator(2);
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}


}
