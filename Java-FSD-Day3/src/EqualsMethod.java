
public class EqualsMethod {
	
	   public static void main(String[] args) {

	        String s1 = "Freddie";
	        String s2 = "Freddie";
	        String s3 = new String("Freddie");
	        String s4 = "Paul";

	        System.out.println(s1.equals(s2)); // true
	        System.out.println(s1.equals(s3)); //  true
	        System.out.println(s1.equals(s4)); // false

	        String s5 ="FREDDIE";
	        System.out.println(s1.equals(s5)); // false
	        System.out.println(s1.equalsIgnoreCase(s5)); // true

	    }
	}