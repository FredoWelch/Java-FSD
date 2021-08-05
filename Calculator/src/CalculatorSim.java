import java.util.Scanner;

public class CalculatorSim {
	
	
	private static double add(double num1, double num2) {
		return num1 + num2;
		
	}
	
	private static double subtract(double num1, double num2) {
		return num1 - num2;
		
	}
	private static  double multiply(double num1, double num2) {
		return num1 * num2;
		
	}
	private static double divide(double num1, double num2) {
		return num1 / num2;
		
	}
	
	
	public static void main(String[] args) {
		
		int menu = 0;
		double amountA;
		double amountB;
		Scanner in = new Scanner(System.in);
		
		
		while(menu != 5) {

		System.out.println("What kind of calulation would you like to do?");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiplication");
		System.out.println("4. Divide");
		System.out.println("5. Quit");
		menu = in.nextInt();
		
		
				switch(menu) {
		
		case 1: System.out.println("Pick your first number you would like to add");
		Scanner scan = new Scanner(System.in);
		amountA = scan.nextDouble();
		System.out.println("Pick your second number you would like to add");
		amountB = scan.nextDouble();
		System.out.println(amountA + " + " + amountB + " = " + add(amountA, amountB));
		break;
		
		case 2: System.out.println("Pick your first number you would like to subtract");
		Scanner scan2 = new Scanner(System.in);
		amountA = scan2.nextDouble();
		System.out.println("Pick your second number you would like to subtract");
		amountB = scan2.nextDouble();
		System.out.println(amountA + " - " + amountB + " = " + subtract(amountA, amountB));
		break;
		
		case 3: System.out.println("Pick your first number you would like to multiply");
		Scanner scan3 = new Scanner(System.in);
		amountA = scan3.nextDouble();
		System.out.println("Pick your second number you would like to multiply");
		amountB = scan3.nextDouble();
		System.out.println(amountA + " * " + amountB + " = " + multiply(amountA, amountB));
		break;
		
		case 4: System.out.println("Pick your first number you would like to didive");
		Scanner scan4 = new Scanner(System.in);
		amountA = scan4.nextDouble();
		System.out.println("Pick your second number you would like to divide");
		amountB = scan4.nextDouble();
		System.out.println(amountA + " / " + amountB + " = " + divide(amountA, amountB));
		break;
		
		case 5: System.out.println("SEE YA!");
		break;
		
		default: System.out.println("That wasn;t an option");
		
		}
	}

	}
}
