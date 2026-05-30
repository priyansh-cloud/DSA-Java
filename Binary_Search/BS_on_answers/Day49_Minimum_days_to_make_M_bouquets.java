public class Day49_Minimum_days_to_make_M_bouquets {
    
    public static void main(String[] args) {
        
        //!         Brute 

        // int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
        // int k = 3;
        // int m = 2;
        // int day;

        
        // // find minimum
        // int min = bloomDays[0];
        // for( int i = 1; i < bloomDays.length; i++ ){
        //     if( min > bloomDays[i] ){
        //         min = bloomDays[i];
        //     }
        // }


        // // find maxi
        // int maxi = bloomDays[0];
        // for( int i = 1; i < bloomDays.length; i++ ){
        //     if( maxi < bloomDays[i] ){
        //         maxi = bloomDays[i];
        //     }
        // }

        // // check each days

        // for( day = min; day<= maxi; day++ ){

        //     int count = 0;
        //     int Bouquets = 0;

        //     for( int i = 0; i < bloomDays.length; i++ ){

        //         if( bloomDays[i] <= day ){
        //         count++;
        //     }
        //     else{
        //         Bouquets += count/k;
        //         count = 0;
        //     }

        //     }

        //      Bouquets += count/k;
        
        //     if( Bouquets >= m ){
        //         System.out.println(day);
        //         break;
        //     }

            
        // }
       


        //!         Optimal [ Binary Search ]

        int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        
        // find min and max
        int min = bloomDays[0];
        int maxi = bloomDays[0];

        for(int i = 1; i < bloomDays.length; i++) {

            min = Math.min(min, bloomDays[i]);
            maxi = Math.max(maxi, bloomDays[i]);
        }


        int low = min, high = maxi;

        while( low <= high ){

            if( m*k > bloomDays.length){
                System.out.println(" not found ");
                break;
            }

            int mid = ( low + high )/2;

            
            int count = 0;
            int Bouquets = 0;

            // check for this mid day only
            for( int i = 0; i < bloomDays.length; i++ ){

                if( bloomDays[i] <= mid ){ // “Has this flower bloomed by day mid?”
                count++; // 7  <= 10  → bloomed ✅ and 13 <= 10  → not bloomed ❌ --> now if condition fails and moves to else cond.
            }
            else{
                Bouquets += count/k;
                count = 0;
            }

        }

        // possible

        Bouquets += count/k;

        if( Bouquets >= m ){
               high = mid - 1;
            }
            else{
                low = mid + 1;
            }

            
        }

        System.out.println(low);



    }
}
