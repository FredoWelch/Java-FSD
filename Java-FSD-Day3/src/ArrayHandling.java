
public class ArrayHandling {
	
	public static void main(String[] args) {
		
		int[] a =  new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		try {
			System.out.println(a[10]);
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
