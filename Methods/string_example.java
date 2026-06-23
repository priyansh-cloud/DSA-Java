

public class string_example {
    
    public static void main(String[] args) {
        
        // String msg = greetings();
        // System.out.println( msg );

        String personalised = myGreet("Priyanshu");
        System.out.println( personalised );

    }

    static String myGreet( String name ) {

        String greeting = "hello " + name;
        return greeting;
    }



    static String greetings() {

        String greet = " how are U ? ";
        return greet;
    }
}
