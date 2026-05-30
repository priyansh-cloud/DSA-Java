public class Day50_Smallest_Divisor_Given_a_Threshold {
    
    public static void main(String[] args) {
        
        //!        Brute
        //?     TC -> max * n

        // int[] arr = {1, 2, 3, 4, 5};
        // int limit = 8;

        // // max
        // int max = arr[0];
        // for( int i = 1; i<arr.length; i++ ){
        //     if( max < arr[i] ){
        //         max = arr[i];
        //     } 
        // }

        // for( int d = 1; d<max; d++ ){

        //     int sum = 0;
        //     for( int i = 0; i<arr.length; i++ ){
        //         sum += (int)Math.ceil((double) arr[i]/d );
        //     }
        //     if( sum <= limit ){
        //         System.out.println( d );
        //         return;
        //     }
        // }
        // System.out.println(" not found ");


        //!                 Optimal [ Binary Search ]


        // (a + b - 1) / b
        
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;

        // max
        int max = arr[0];
        for( int i = 1; i<arr.length; i++ ){
            if( max < arr[i] ){
                max = arr[i];
            } 
        }

        int low = 1, high = max;

        while( low <= high){

            int mid = ( low + high )/2;

            int sum = 0;
            for( int i = 0; i<arr.length; i++ ){
                sum += (int)Math.ceil((double) arr[i]/mid );

                // faster than Math.ceil
                // sum += (nums[i] + mid - 1) / mid;
            }
            if( sum <= limit ){
                high = mid - 1; // because i need smaller, so no need to search in right half cause all will be bigger there
            }
            else{
                low = mid + 1;
            }

        }
        System.out.println(low);



    }
}
