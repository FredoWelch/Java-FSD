package HashSetQuestions;

import java.util.HashSet;

public class Question4 {
	
	//4. Write a Java program to empty an hash set.
	
	public static void main(String[] args) {
		
		HashSet<String> hs4 = new HashSet<>();
		
		hs4.add("Bean");
		hs4.add("Fruit");
		hs4.add("Pizza");
		hs4.add("Fries");
		System.out.println(hs4);
		
		hs4.clear();
		System.out.println(hs4 + "Cleared");
	}


}
