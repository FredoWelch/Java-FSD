package ArrayListQuestions;
import java.util.ArrayList;

public class Question9 {
	
	//9. Write a Java program to copy one array list into another.
	
	public static void main(String[] args) {
		
		ArrayList<String> sports = new ArrayList<>();
		
		sports.add("Basketball");
		sports.add("Football");
		sports.add("Baseball");
		System.out.println(sports);
		
		ArrayList<String> newSports = new ArrayList<>(sports);
		System.out.println(newSports);
		
		
	}


}
