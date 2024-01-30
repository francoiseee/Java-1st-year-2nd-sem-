import java.util.*;

public class WithMethods {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String continueP;
        do{
        System.out.print("Menu\n[1]\tConverts Minutes to Hour and Minutes\n[2]\tComputes compound interest\n[3]\tExit\n");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        
        if (choice == 1){
            mins();
        }

        else if (choice == 2){
            cpInterest();
        }

        else if (choice == 3){
            System.out.print("Thank you :D");
            break; 
        }
        System.out.println("\nDo you want to repeat again [y/n]?: ");
            continueP = input.next().toLowerCase();
            input.nextLine();

        } while (continueP.equals("y"));
 
    }
    public static void mins(){
        System.out.print("Enter the minutes worked: ");
        double enter = input.nextDouble();
        int hours = (int) enter / 60;
        int mins = (int) enter % 60;
        int seconds = (int) (enter * 60) % 60;
    
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + mins);
        System.out.println("Seconds: " + seconds);
    }

    public static void cpInterest() {
        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter annual interest rate (in percentage): ");
        double rate = input.nextDouble() / 100;
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double amount;
        double interest;

        System.out.println("Year\tPrincipal\tInterest\tTotal");
        for (int i = 1; i <= years; i++) {
            interest = principal * rate;
            amount = principal + interest;
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\n", i, principal, interest, amount);
            principal = amount;
    }
}
}
