import java.util.*;
class apat{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter amount of change\t: Php\t");
		double change = scan.nextDouble();
		int oh=0, fifty=0, twent=0, ten=0, five=0, one=1;

		oh = (int) change/100; change = change%100;
		fifty = (int) change/50; change %= 50;
		twent = (int) change/20; change %= 20;
		ten = (int) change/10; change %= 10;
		five = (int) change/5; change %= 5;
		one = (int) change/1; change %= 1;

		System.out.println("Breakdown is as follows: ");
		System.out.println("100\t:\t" + oh);
		System.out.println("50\t:\t" + fifty);
		System.out.println("20\t:\t" + twent);
		System.out.println("10\t:\t" + ten);
		System.out.println("5\t:\t" + five);
		System.out.println("1\t:\t" + one);
	}
}