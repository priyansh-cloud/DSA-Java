import java.util.Scanner;

public class sum {
    
    public static void main(String[] args) {
        
        // sum();
        // sum();
        // sum();

        // here we can call sum() mutiple times and
        // we dont have to copy/paste the entire code_base

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        int ans = sum3(20, 30);
        System.out.println(ans);

    }

    //! Pass the value of numbers when we are calling the method in main()
    static int sum3( int a, int b ){
        int sum = a + b;
        return sum;
    }

    /* 
    
    access modifier( OOPS ) return_type name( arguments ) {

        body

        return statement;

    }
    
    */ 
    static void sum() {

        Scanner sc = new Scanner(System.in);
        int a, b, sum;

        System.out.print(" enter 1st no : ");
        a = sc.nextInt();

        System.out.print(" enter 2nd no : ");
        b = sc.nextInt();

        sum = a + b;

        System.out.println( "The sum =  " + sum );

    }

    
}
