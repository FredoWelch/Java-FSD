package ArrayListQuestions;
import java.util.ArrayList;
import java.util.Collections;

public class Question10 {
	
//	10. Write a Java program to shuffle elements in a array list. 
	
	public static void main(String[] args) {
		
		ArrayList<String> candy = new ArrayList<>();
		
		candy.add("Snickers");
		candy.add("Starburst");
		candy.add("Hershey");
		candy.add("LaffyTaffy");
		System.out.println(candy);
		
		Collections.shuffle(candy);
		System.out.println(candy);
		
		
	}


}
