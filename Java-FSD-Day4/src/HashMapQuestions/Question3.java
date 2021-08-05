package HashMapQuestions;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
	
	//3. Write a Java program to copy all of the mappings 
	//from the specified map to another map.
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hp3 = new HashMap<>();
		
		hp3.put(1, "Sky");
		hp3.put(2, "Earth");
		hp3.put(3, "Sea");
		
		
		HashMap<Integer, String> hp4 = new HashMap<>(hp3);
		
		for(Map.Entry entry: hp4.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
	}


}
