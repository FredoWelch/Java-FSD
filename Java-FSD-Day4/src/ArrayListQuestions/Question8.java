package ArrayListQuestions;
import java.util.ArrayList;
import java.util.Collections;

public class Question8 {
	
	 // 8. Write a Java program to sort a given array list. 
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(3);
		num.add(6);
		num.add(65);
		num.add(32);
		num.add(1);
		System.out.println(num);
		
		Collections.sort(num);
		System.out.println(num);
	
	
	}
	


}
