import java.util.Scanner;

class medjCalcu{
	public static void main(String[] args) {

		Scanner num1 = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = num1.nextInt();
		Scanner num2 = new Scanner(System.in);
		System.out.print("Enter second number: ");
		int b = num2.nextInt();
		int c = a+b;

		System.out.println("The total of the first and second number: "+ c);
	}

}