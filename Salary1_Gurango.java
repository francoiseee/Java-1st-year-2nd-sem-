import java.util.*;
class Salary1_Gurango{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Employee Annual Salary\t: Php\t");
		double salary = scan.nextDouble();
		double prevM =0, retroM=0, retroSix=0, newM=0, newA=0;

		prevM = salary/13; 
		retroM= 0.076*prevM; 
		retroSix= retroM*6; 
		newM = prevM+ retroM; 
		newA = newM*13;



		System.out.println("Previous Annual Salary\t: Php\t" + salary);
		System.out.println("Previous Monthly Salary\t: Php\t" + prevM);
		System.out.println("Retro Monthly Salary\t: Php\t" + retroM);
		System.out.println("Six months RetroPay\t: Php\t" + retroSix);
		System.out.println("New Monthly Salary\t: Php\t" + newM);
		System.out.println("New Annual Salary\t: Php\t" + newA);

	}
}