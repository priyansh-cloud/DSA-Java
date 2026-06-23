
import java.util.Scanner;



// In java we call functions as Mehtods
// Because if we have Class and inside that function we call it as methods
// And in java everything we put inside class

// Function ==> block of code

public class funtions {
    
    
    public static void main(String[] args) {
        
        // Q: take input of 2 no.s and print sum

        Scanner sc = new Scanner(System.in);

        int a, b, sum;

        System.out.print(" enter 1st no : ");
         a = sc.nextInt();

        System.out.print(" enter 2nd no : ");
         b = sc.nextInt();

         sum = a + b;

        System.out.println( "The sum =  " + sum );

        // what if someone says to do sum 10 times or 100 times thn we gonna copy the code 100times
        // no right => here comes the methods or functions. 
        
    }
}
