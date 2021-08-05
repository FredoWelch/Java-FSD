package ArrayListQuestions;
import java.util.ArrayList;

public class Questtion2 {
	/* 2. Write a Java program to iterate through all 
	elements in a array list. */
	
	public static void main(String[] args) {
		
		ArrayList<String> fruitList = new ArrayList<>();
		
		fruitList.add("Pear");
		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("Peach");
		fruitList.add("Banana");
		
		for(String item: fruitList) {
			System.out.println(item);
		}
		
	}


}
