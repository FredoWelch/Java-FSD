package ArrayListQuestions;
import java.util.ArrayList;

public class Question6 {
	
	/* 6. Write a Java program to remove the third 
	element from a array list. */
	
	public static void main(String[] args) {
		
		ArrayList<String> pets = new ArrayList<>();
		
		pets.add("Dog");
		pets.add("Cats");
		pets.add("Fish");
		pets.add("Hamster");
		System.out.println(pets);
		
		pets.remove(2);
		System.out.println(pets);
		
		
	}


}
