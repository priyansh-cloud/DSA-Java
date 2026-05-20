
public class Day41_lower_bound {
    public static void main(String[] args) {
        
        //!          brute force
        // int[] arr = {3, 5, 8, 15, 19};

        // int x = 5;

        // for( int i = 0; i<arr.length; i++) {
        //     if( arr[i] >= x ){
        //         System.out.println(i);
        //         break;
        //     }
            
        // }


        //!        optimal [ binary search ]

        int[] arr = {3, 5, 8, 15, 19};
        int x = 15;
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;

        while( low <= high ){

            int mid = ( low+high )/2;

            if( arr[mid] >= x ){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(ans);
        
    }
}
