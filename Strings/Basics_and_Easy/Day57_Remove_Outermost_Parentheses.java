public class Day57_Remove_Outermost_Parentheses {
    
    public static String removeOuterParentheses(String s) {
        
        int count = 0;
        StringBuilder ans = new StringBuilder();

        for( int i = 0; i<s.length(); i++ ){

            if( s.charAt(i) == '(' ){
                
                if( count > 0 ){
                    ans.append( s.charAt(i) );
                }

                count++;
            }
            else if( s.charAt(i) == ')' ){

                count--;

                if( count > 0 ){
                    ans.append( s.charAt(i) );
                }
                
            }
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        
    String s = "(()())(())";

    String ans = removeOuterParentheses(s);

    System.out.println(ans);

    }
}
