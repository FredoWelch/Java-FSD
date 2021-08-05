package HashMapQuestions;

import java.util.HashMap;
import java.util.Map;

public class Question2 {
	
	//2. Write a Java program to count the number of key-value (size)
	//mappings in a map.
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hp2 = new HashMap<>();
		
		hp2.put(1, "Orange");
		hp2.put(2, "Blue");
		hp2.put(3, "Red");
		
		System.out.println(hp2.size());
		
	}


}
