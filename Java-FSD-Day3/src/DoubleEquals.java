
public class DoubleEquals {
	
	 public static void main(String[] args) {

	        String s1 = "Freddie";
	        String s2 = "Freddie";
	        String s3 = new String("Freddie");

	        System.out.println(s1 == s2);  // true  because both refers to same instance
	        System.out.println(s1 == s3);  // false because s3 refers to instance created in normal heap

	    }
	}


