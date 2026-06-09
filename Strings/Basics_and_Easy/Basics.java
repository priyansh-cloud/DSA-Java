
public class Basics {

    public static void main(String[] args) {
        
        // String FirstName = "Priyanshu";
        // String lastName = "Kumar";

        // System.out.println( FirstName + " " + lastName );
        // System.out.println( FirstName.length() );
        // System.out.println( FirstName.charAt(1));

        //!     String -> Immutable

        String name = "banty"; // name ─────► "banty"
        
        name = "santy"; //           "banty"
        //               name ─────► "santy"

        System.out.println(name); // santy. But why ?
        // the refrence got changed 
        // from name = banty to name = santy

        

    }
    
}
