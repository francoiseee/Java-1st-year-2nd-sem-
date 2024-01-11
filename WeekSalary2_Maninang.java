import java.util.Scanner;
import java.text.DecimalFormat;

class WeekSalary2_Maninang {
	static Scanner input = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#,##0.00");
    public static void main(String[] args) {
        
       
        System.out.print("Enter your Name: "); String name = input.nextLine();
        System.out.print("[1] Manager \n[2] Supervisor \n[3] Employee \nEnter your Position: "); int position = input.nextInt();
        System.out.print("Enter Number of Hours Worked: "); double hoursWorked = input.nextDouble();

        double rate = 0;
        String positionName = "";

        switch (position) {
            case 1: 
                rate = 500;
                positionName = "[1] Manager";
                break;
            case 2: 
                rate = 400;
                positionName = "[2] Supervisor";
                break;
            case 3: 
                rate = 300;
                positionName = "[3] Employee";
                break;
            default:
                rate = 0;
                positionName = "Invalid Choice.";
        }

        double gross = hoursWorked * rate;

        double bonus = 0;

        if (gross >= 8000) {
        	bonus = 1000;
        } else if (gross >= 5000) {
        	bonus = 750;
        } else {
        	bonus = 0; 
        }

        double sss = gross * 0.10;
        double medical = 100;
        double tax;

        if (gross >= 7000) {
            tax = 0.15 * gross;
        } else if (gross >= 4000) {
            tax = 0.10 * gross;
        } else if (gross >= 2000) {
            tax = 0.05 * gross; 
        } else {
            tax = 0 * gross; 
        }

        double totalDeduction = sss + medical + tax;
        double netPay = gross + bonus - totalDeduction;

        System.out.println("Employee Name: " + name);
        System.out.println("Position:      " + positionName);
        System.out.println("Gross Pay:     Php " + df.format(gross));
        System.out.println("Bonus:         Php " + df.format(bonus));
        System.out.println("Deductions: ");  
        System.out.println("            SSS: Php " + df.format(sss));
        System.out.println("        Medical: Php " + df.format(medical));
        System.out.println("            Tax: Php " + df.format(tax));
        System.out.println("Total Deduction: Php " + df.format(totalDeduction));
        System.out.println("Net Pay:       Php " + df.format(netPay));
        
    }
}