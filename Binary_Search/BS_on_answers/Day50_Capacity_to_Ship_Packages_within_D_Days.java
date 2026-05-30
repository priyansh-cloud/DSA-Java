public class Day50_Capacity_to_Ship_Packages_within_D_Days {
    
    public static void main(String[] args) {
        
        //!                 Brute
        //?     TC : O( sum - max ) + 1 * O( n )
        // Input weights
        // int[] weights = {5,4,5,2,3,4,5,6};
        // // Days to ship
        // int d = 5;

      

        // // max
        // int max = weights[0];
        // for( int i = 0; i<weights.length; i++ ){
        //     if( max < weights[i] ){
        //         max = weights[i];
        //     }
        // }

        // // sum
        // int sum = 0;
        // for( int i = 0; i<weights.length; i++ ){
        //     sum += weights[i];
        // }

        // // try every capacity
        // for( int cap = max; cap<sum; cap++ ){
            
        //     // to find required days
        //     int days = 1;
        //     int load = 0;

        //     for( int j = 0; j<weights.length; j++ ){

        //         // exceed capacity
        //         if( load + weights[j] > cap){
        //             days++; // move to day 2 and so on
        //             load = weights[j];
        //         }
        //         else{
        //             load += weights[j];
        //         }
                
        //     }

        //     // valid capacity
        //     if( days <= d ){
        //         System.out.println( cap );
        //         return;
        //     }
            
        // }
        // System.out.println(" not found ");



        //!                  Optimal

        // Input weights
        int[] weights = {5,4,5,2,3,4,5,6};
        // Days to ship
        int d = 5;

        // max
        int max = weights[0];
        for( int i = 0; i<weights.length; i++ ){
            if( max < weights[i] ){
                max = weights[i];
            }
        }

        // sum
        int sum = 0;
        for( int i = 0; i<weights.length; i++ ){
            sum += weights[i];
        }

        int low = max;
        int high = sum;

        while( low <= high ){
            int mid = low + ( high - low )/2;

            int days = 1;
            int load = 0;

            for( int j = 0; j<weights.length; j++ ){

                // exceed capacity
                if( load + weights[j] > mid){
                    days++; // move to day 2 and so on
                    load = weights[j];
                }
                else{
                    load += weights[j];
                }
                
            }

            if(days <= d){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }


        }

        System.out.println( low );

    }
}
