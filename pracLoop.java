import java.util.Scanner;
class pracLoop {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char answer = ' ';
        do{
            for (int i = 0; i < 5; i++)
            {
                System.out.println("I miss u, wonu !");
            }
            System.out.print("Do you want this to repeat again? [Y]");
            answer = input.next().toUpperCase().charAt(0);
        }
        while (answer == 'Y');
        System.out.println("Ending");
        
    }
    
}

/* 
Scanner input = new Scanner(System.in);
for (int i = 0; i < 5; i++)
{
    System.out.println("I love u, wonu");
}
*/
// -----------------------------------------------------------------------
/* 
Scanner input = new Scanner(System.in);
int limit = 3; 
System.out.print("Please enter integer higher than " + limit + ": ");
int userEntry = input.nextInt();

while (userEntry > limit)
{
    System.out.print("Please enter integer higher than " + limit + ": ");
    userEntry = input.nextInt();
}

  System.out.println("You entered " + userEntry);
  */
// -----------------------------------------------------------------------

    /* Scanner input = new Scanner (System.in);
        System.out.print("Enter no of times to repeat: ");
        int times = input.nextInt();

        int i = 0;

        while (i < times) 
        {
            System.out.println("WONWOO <3 ");
            i += 1;
        }*/
// -----------------------------------------------------------------------

       /*  int i;
        final int dulo = 11;

        i = 1;
        while (i < dulo)
        {
            System.out.println(i);
            i = i + 1;
        }
        */

// -----------------------------------------------------------------------
        /*int x, y;
        x = 5 % 2;
        y = 4 % 2 ;

        System.out.println(x);
        System.out.println(y);
        */
