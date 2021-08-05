package HashMapQuestions;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
	
/* 1. Write a Java program to associate the specified value with 
	the specified key in a HashMap. */
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hp = new HashMap<>();
		
		hp.put(1, "Fred");
		hp.put(2, "Carl");
		hp.put(3, "Tom");
		hp.put(4, "Hank");
		
		for(Map.Entry entry: hp.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue() );
		}
	}
	



}
