import java.util.*;
class Amount_Change_Gurango{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter amount of change\t: Php\t");
		double change = scan.nextDouble();
		int ot=0, fh=0, th=0, oh=0, fifty=0, twent=0, ten=0, five=0, one=1, tf=0, t=0, f=0, o=1;

		ot = (int) change/1000; change = change%1000;
		fh = (int) change/500; change = change%500;
		th = (int) change/200; change = change%200;
		oh = (int) change/100; change = change%100;
		fifty = (int) change/50; change %= 50;
		twent = (int) change/20; change %= 20;
		ten = (int) change/10; change %= 10;
		five = (int) change/5; change %= 5;
		one = (int) change/1; change %= 1;
		tf = (int) (change/0.25); change %= 0.25;
		t = (int) (change/0.10); change %= 0.10;
		f = (int) (change/0.05); change %= 0.05;
		o = (int) (change/0.01); change %= 0.01;

		System.out.println("Breakdown is as follows: ");
		System.out.println("1000\t:\t" + ot);
		System.out.println("500\t:\t" + fh);
		System.out.println("200\t:\t" + th);
		System.out.println("100\t:\t" + oh);
		System.out.println("50\t:\t" + fifty);
		System.out.println("20\t:\t" + twent);
		System.out.println("10\t:\t" + ten);
		System.out.println("5\t:\t" + five);
		System.out.println("1\t:\t" + one);
		System.out.println("0.25\t:\t" + tf);
		System.out.println("0.10\t:\t" + t);
		System.out.println("0.05\t:\t" + f);
		System.out.println("0.01\t:\t" + o);

	}
}

//1899.99