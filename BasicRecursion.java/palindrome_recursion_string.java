public class palindrome_recursion_string {
    
    public static boolean f(int i, int n, String s){

        if(i>=n/2){
            return true;
        }

        if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        
        return f(i+1,n,s);

    }

    public static void main(String[] args) {

        String s = "MADAM";
        int n = s.length();
        boolean ans = f(0,n,s);

        System.out.println(ans);
        
    }
}

// note :
//  Array 	   String
//  arr[i]	   s.charAt(i)
//  length	   length()
//  mutable	   immutable