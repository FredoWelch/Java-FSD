package LinkedListQuestions;

import java.util.LinkedList;

public class Question5 {
	
	//5. Write a Java program to insert the specified 
	//element at the specified position in the linked list. 
	
	public static void main(String[] args) {
		
		LinkedList<String> ll5 = new LinkedList<>();
		
		ll5.add("Roses");
		ll5.add("Tulips");
		ll5.add("Violets");
		ll5.add("Sunflower");
		System.out.println(ll5);
		
		ll5.add(2, "Candy");
		System.out.println(ll5);
		
	
		
	}


}
