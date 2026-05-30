
import java.util.*;

public class Day51_Aggressive_Cows {
    
    public static void main(String[] args) {
        
        //!         Brute

        // int[] stalls = {1, 2, 8, 4, 9};
        // Arrays.sort(stalls);
        // int cows = 3;

        // int max = stalls[0];
        // int min = stalls[0];

        // for( int i = 1; i<stalls.length; i++ ){
        //     max = Math.max(max, stalls[i]);
        //     min = Math.min(min, stalls[i]);
        // }

        // int ans = 0;

        // for( int dist = 1; dist<max-min; dist++){

        //     int countCows = 1, last = stalls[0];

        //     for( int i = 1; i<stalls.length; i++ ){
        //         if( stalls[i] - last >= dist ){
        //             countCows++;
        //             last = stalls[i];
        //         }
        //     }
        //     if( countCows >= cows ){
        //         ans = dist;
        //     }
            
        // }
        // System.out.println(ans);



        //!             Optimal

        int[] stalls = {1, 2, 8, 4, 9};
        int n = stalls.length;
        Arrays.sort(stalls);
        int cows = 3;

        int low = 0; int high = stalls[n-1] - stalls[0];

        while( low <= high ){
            int mid = low + ( high - low )/2;

            int countCows = 1, last = stalls[0];

            // try placing cows
            for( int i = 1; i<n; i++ ){

                if( stalls[i] - last >= mid ){
                    countCows++;
                    last = stalls[i];
                }
            
            }
            // if possible to place all cows
            if( countCows >= cows){

                // try bigger distance
                low = mid + 1;
            }
            else{

                // distance too large
                high = mid - 1;
            }
        }

        System.out.println( high );


    }
}
