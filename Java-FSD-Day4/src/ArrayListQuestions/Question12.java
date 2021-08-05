package ArrayListQuestions;
import java.util.ArrayList;
import java.util.List;

public class Question12 {
	
	//12. Write a Java program to extract a portion of a array list. 
	
	public static void main(String[] args) {
		
		ArrayList alcohol = new ArrayList<>();
		
		alcohol.add("Tequila");
		alcohol.add("Cognac");
		alcohol.add("Vodka");
		alcohol.add("Rum");
		System.out.println(alcohol);
		
		System.out.println(alcohol.subList(0, 2));
		//List<String>newList = alcohol.subList(0, 2);
		//System.out.println(newList);
		
		
		
		
	}


}
