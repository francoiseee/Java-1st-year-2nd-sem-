import java.util.Scanner;

class Calcu {
	public static void main(String[] args){
		try{while (true){
		System.out.print("\n[1] + [2] - [3] * [4] /\n");

		Scanner choice = new Scanner(System.in);
		int choices, num1, num2;

		choices = choice.nextInt();
		System.out.print("Enter your first number: ");
		num1 = choice.nextInt();
		System.out.print("Enter your second number: ");
		num2 = choice.nextInt();

		if (choices == 1){
			System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		else if (choices == 2){
			System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
		}
		else if (choices == 3){
			System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
		}
		else if (choices == 4){
			System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
		}
		else {
			System.out.print("Enter a Correct Choice");
		}

		System.out.print("\nDo you want to restart? [1] Yes [2] No: ");
		int restart = choice.nextInt();
		if (restart == 1) {
			continue;
		}

		else {
			break;
		}
		}
		}
catch (Exception e) {
	System.out.println("\nInvalid Input");
}
System.out.print("Tnx for using my program :)");

	}
}