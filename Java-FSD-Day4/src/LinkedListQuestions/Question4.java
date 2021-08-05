package LinkedListQuestions;

import java.util.Iterator;
import java.util.LinkedList;

public class Question4 {
	
	//4. Write a Java program to iterate a linked list in reverse order.
	
	public static void main(String[] args) {
		
		LinkedList<String> ll4 = new LinkedList<>();
		
		ll4.add("1");
		ll4.add("2");
		ll4.add("3");
		ll4.add("4");
		
		Iterator i = ll4.descendingIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	


}
