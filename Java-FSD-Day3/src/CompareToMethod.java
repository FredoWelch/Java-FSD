
public class CompareToMethod {
	
	 public static void main(String[] args) {
	        String s1 = "Freddie";
	        String s2 = "Freddie";
	        String s3 = "Paul";

	        System.out.println(s1.compareTo(s2)); // 0
	        System.out.println(s1.compareTo(s3));  // -
	        System.out.println(s3.compareTo(s1));  // +
	    }

}
