import java.util.*;
class Palindrome{
	public static void main(String[] args){

	String original, reverse = ""; // Objects of String class 
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a string to check if it is a palindrome: ");
	original = in.nextLine();
	int length = original.length();

	for(int i = length -1; i>=0; i--)
		reverse = reverse + original.charAt(i);
	if(original.equals(reverse))
		System.out.println("The string is a palindrome.");
	else 
		System.out.println("The string isn't a palindrome.");
	}
}

/*
import java.util.*;
public class coisey {
    static Scanner input = new Scanner(System.in);
            public static void main(String[] args) {
                String original, reverse = ""; // Objects of String class
                Scanner in = new Scanner(System.in);
                System.out.print("Enter a string to check if it is a palindrome: ");
                original = in.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase(); // Removing non-alphabetic characters and converting to lowercase
                int length = original.length();
        
                for (int i = length - 1; i >= 0; i--)
                    reverse += original.charAt(i);
                if (original.equals(reverse))
                    System.out.println("The string is a palindrome.");
                else
                    System.out.println("The string isn't a palindrome.");
            }
        }
*/
