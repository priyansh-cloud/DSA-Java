
public class Day48_find_sqrt {
    
    public static void main(String[] args) {
        
        //!        Brute

        // int n = 28;
        // int ans = 1;

        // for( int i = 0; i<= n; i++ ){
        //     if( i*i <= n ){
        //         ans = i;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // System.out.println(ans);


        //!        Optimal

        int n = 28;
        int low = 1;
        int high = n;

        while( low <= high ){

            int mid = ( low + high )/2; // we can use long for big nummbers
            int val = mid*mid;          // long val = ( long ) mid*mid

            if( val <= n ){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        System.out.println(high);



    }
}
