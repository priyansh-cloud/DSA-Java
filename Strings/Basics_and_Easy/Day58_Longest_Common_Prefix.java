public class Day58_Longest_Common_Prefix {
    
    public static  String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];
        for( int i = 1; i<strs.length ; i++ ){

            while( !strs[i].startsWith( prefix )) {

                prefix = prefix.substring( 0, prefix.length() - 1 );
                // keep chopping off the last character until every string starts with prefix."

                if( prefix.isEmpty() ){
                    return "";
                }

            }
        }

        return prefix;

    }

    public static void main(String[] args) {
        
        String strs[] = {"flower","flow","flight"};
        String ans = longestCommonPrefix(strs);

        System.out.println(ans);
    }
}
