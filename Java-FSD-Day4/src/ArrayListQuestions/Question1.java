package ArrayListQuestions;
import java.util.ArrayList;

public class Question1 {
	
	/*1. Write a Java program to create a new array list, 
	add some colors (string) and print out the collection. */
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Purple");
		colors.add("Sapphire");
		
		System.out.println(colors);
		
		for(String item: colors) {
			System.out.println(item);
		}
		
	}

}
