package HashSetQuestions;

import java.util.HashSet;

public class Question2 {
	
	//2. Write a Java program to iterate through all elements in a hash list. 
	
	public static void main(String[] args) {
		
		HashSet<String> hs2 = new HashSet<>();
		
		hs2.add("1");
		hs2.add("2");
		hs2.add("3");
		hs2.add("4");
		
		for(String item: hs2) {
			System.out.println(item);
		}
	}


}
