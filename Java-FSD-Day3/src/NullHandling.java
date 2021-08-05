
public class NullHandling {
	
	public static void main(String[] args) {
		
		String str = "Freddie";
		System.out.println(str.length());
		
		String str2 = null;
		
		try {
			System.out.println(str2.length());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
