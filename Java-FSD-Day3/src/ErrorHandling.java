
public class ErrorHandling {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		int c = 0;
		

        try{
            c = b / c;
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch (Exception ex){

        }


        System.out.println(c);
		
	}

}
