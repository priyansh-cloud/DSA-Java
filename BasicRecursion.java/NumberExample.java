

public class NumberExample {
    
    public static void main(String[] args) {
        
        // write a function to take and print 5 no.s
        print1(1);
    }

    static void print1( int n ){
        System.out.println(n); // print -> 1
        print2(2);
    }

    static void print2( int n ){
        System.out.println(n); // print -> 2
        print3(3);
    }

    static void print3( int n ){
        System.out.println(n); // print -> 3
        print4(4);
    }

    static void print4( int n ){
        System.out.println(n);// --> 4
        print5(5);
    }

    static void print5( int n ){
        System.out.println(n); // -->
    }
}
