package HashSetQuestions;

import java.util.HashSet;

public class Question3 {
	
	//3. Write a Java program to get the number of elements in a hash set. 
	
	public static void main(String[] args) {
		
		HashSet<String> hs3 = new HashSet<>();
		
		hs3.add("Sun");
		hs3.add("Moon");
		hs3.add("Plane");
		hs3.add("Grass");
		
		System.out.println(hs3.size());
		
	}
	


}
