package ArrayListQuestions;
import java.util.ArrayList;

public class Question7 {
	
	/* 7. Write a Java program to search an 
	element in a array list. */
	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<>();
		
		food.add("Burgers");
		food.add("Pizza");
		food.add("Milkshake");
		
		System.out.println(food.contains("Pizza"));
		
		

		
	}
	

}
