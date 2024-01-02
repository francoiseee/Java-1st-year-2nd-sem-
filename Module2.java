import java.util.Scanner;

class Module2 {
    public static void main(String[] args) {
        Scanner caro = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int no1 = caro.nextInt();
        System.out.print("Enter 2nd number: ");
        double no2 = caro.nextDouble(); //caro.nextLine();
        System.out.print("Enter 3rd number: ");
        float no3 = caro.nextFloat();caro.nextLine();
        System.out.print("Enter name: ");
        String name = caro.nextLine();
        System.out.println("1st number: " +no1);
        System.out.println("2nd number: " +no2);
        System.out.println("3rd number: " +no3);
        System.out.println("Name: " +name);
        System.out.println("");
   

		/*
		int no1 = 50; //ordinary variable declaration
		int no2 = 100, temp = 0; // variable declaration w/ initial value assigned
		System.out.println("Before");
		System.out.println("The value of no1 " + no1);
		System.out.println("The value of no2 " + no2);

		temp = no1; //no1=50 no2=100 temp=50
		no1 = no2; //no1=100 no2=100 temp=50
		no2 = temp; //no1=100 no2=50 temp=50; 
		System.out.println("After");
		System.out.println("The value of no1 " + no1);
		System.out.println("The value of no2 " + no2);

		int myAge = 25, yourAge = 19; // 2 variables where declared and initialized
		final double PI = 3.1416; */
	}
}
