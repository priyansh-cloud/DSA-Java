public class Day59_Rotate_String {
    

    public static  boolean rotateString(String s, String goal) {
        
       if( s.length() != goal.length() ){
            return false;
       }
        // (s + s ) => "abcdeabcde"
        // check "abcdeabcde".contains("cdeab") => if -> yes, then return True
       return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        
        String s = "abcde", goal = "cdeab";
        boolean ans = rotateString(s, goal);

        System.out.println(ans);
    }
}
