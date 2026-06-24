

public class NumberExample_Recursion {
    
    public static void main(String[] args) {
        
        // write a function to take and print 5 no.s
        print(1);
    }

    static void print( int n ){

        if( n == 5 ){

            System.out.println(5); 
            return;
        }
        System.out.println(n); 

        // Tail recursion
        // This is the last function call
        print( n + 1 );
    }

    

}
