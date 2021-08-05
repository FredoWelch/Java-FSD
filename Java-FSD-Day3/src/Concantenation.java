
public class Concantenation {
	
	public static void main(String[] args) {

        String str = "Hello" + " World";
        System.out.println(str); // Hello World

        String str2 = 10 + 20 + 30 + "Sum" + 40 + 50;
        System.out.println(str2);  //60Sum4050

        String str3 = (new StringBuilder()).append("Hello").append("World").toString();
        
        System.out.println(str3);

    }

}
