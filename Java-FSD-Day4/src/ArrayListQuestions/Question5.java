package ArrayListQuestions;
import java.util.ArrayList;

public class Question5 {
	
	/* 5. Write a Java program to update specific array 
	element by given element. */
	
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<>();
		
		cars.add("Lambo");
		cars.add("Posche");
		cars.add("Audi");
		cars.add("BMW");
		
		System.out.println(cars);
		
		cars.set(1, "Tesla");
		
		System.out.println(cars);
		
	}


}
