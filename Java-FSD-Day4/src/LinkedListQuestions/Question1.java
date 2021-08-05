package LinkedListQuestions;

import java.util.LinkedList;

public class Question1 {
	
	//1. Write a Java program to append the specified element 
	//to the end of a linked list.
	
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		System.out.println(ll);
		
		ll.addLast("Apple");
		System.out.println(ll);
		
	}


}
