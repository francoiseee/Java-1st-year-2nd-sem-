import java.util.Scanner;
class OddOrEven{
	public static void main(String[] args){
		int x;
		Scanner integer = new Scanner(System.in);

	System.out.print("Enter an integer to check if it is an Odd or Even: ");
	x = integer.nextInt();
	if (x % 2 == 0)
		System.out.println("The number is even!!");
	else 
		System.out.println("The number is odd!!");
	}
}