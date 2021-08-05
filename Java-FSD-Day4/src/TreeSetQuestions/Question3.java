package TreeSetQuestions;

import java.util.TreeSet;

public class Question3 {
	
	//3. Write a Java program to add all the elements of a specified tree set 
			//to another tree set. 
	
	public static void main(String[] args) {
		
		TreeSet<String> hs3 = new TreeSet<>();
		
		hs3.add("Sky");
		hs3.add("Water");
		hs3.add("Earth");
		hs3.add("Fire");
		System.out.println(hs3);
		
		TreeSet<String> hsCopy = new TreeSet<>(hs3);
		System.out.println(hsCopy);
		
		
		
		
	}

}
