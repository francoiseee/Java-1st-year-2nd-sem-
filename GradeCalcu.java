//This program will compute the average of your grade and identify if you passed or failed 

	// i++ increment the variable i by 1. It is the equivalent to i = i + 1. 
	//i– decrements (decreases) the variable i by 1. It is the equivalent to i = i - 1.
import java.util.Scanner;

class GradeCalcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.println("Enter name:");
        String name = scanner.next();
        
        System.out.println("Enter the number of subjects:");
        n = scanner.nextInt();
        
        while (n <= 0) {
            System.out.println("Invalid number of subjects. Please enter a valid number:");
            n = scanner.nextInt();
        }
        
        int[] grades = new int[n];
        double avg = 0;

        System.out.println("Enter your grades:");

        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextInt();
            avg += grades[i];
        }

        avg /= n;

        System.out.print(name + " The average of your grade (");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(grades[i] + ", ");
        }
        System.out.println(grades[n - 1] + ") = " + avg);
    }
}

