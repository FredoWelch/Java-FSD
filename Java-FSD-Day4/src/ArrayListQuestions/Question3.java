package ArrayListQuestions;
import java.util.ArrayList;

public class Question3 {
	
	/* 3. Write a Java program to insert an element into the 
	array list at the first position.*/
	
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Atlanta");
		cities.add("DC");
		cities.add("Houston");
		cities.add("Las Vegas");
		System.out.println(cities);
		
		
		//Inserted to the first position
		cities.add(0, "Seattle");
		System.out.println(cities);
		
	
		
	}


}
