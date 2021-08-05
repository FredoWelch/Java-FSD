package TreeSetQuestions;

import java.util.Iterator;
import java.util.TreeSet;

public class Question4 {
	
	//4. Write a Java program to create a reverse order view of the elements contained
	//in a given tree set.
	
	
	public static void main(String[] args) {
		
		TreeSet<String> ts4 = new TreeSet<>();
		
		ts4.add("1");
		ts4.add("2");
		ts4.add("3");
		ts4.add("4");
		System.out.println(ts4);
		
		Iterator i = ts4.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	}


}
