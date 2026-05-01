
import java.util.*;
public class Day24_longest_consecutive_sequence {
    public static void main(String[] args) {
        
        // Brute : TC && SC

        int[] a = {100, 4, 200, 1, 3, 2};

        // int longest = 1;
        // for(int i = 0; i<a.length; i++){
        //     int x = a[i]; // 1
        //     int count = 1;
        //    // linear serch
        //    while(true){
        //     boolean found = false;

        //      for( int j = 0; j<a.length; j++){
        //         if( a[j] == x + 1){  // 1 == 1
        //         x = x + 1; // 2
        //         count = count+1; // count = 2
        //         found = true;
        //         break;
        //     }
        //    }
        //     if(!found) break;
            
        //    }
        //   longest = Math.max( longest, count);
          
        // }

        // System.out.println(longest);


        // ----------------------------------->    Better

        // int[] a = {100, 4, 200, 1, 3, 2};

        if( a.length == 0){
            System.out.println(0);
        }
        Arrays.sort(a); // sorting
        
        int longest = 1;
        int count = 0;
        int last_small = Integer.MIN_VALUE;

        for(int i = 0; i<a.length; i++){

            if( a[i] -1 == last_small ){
                count++;
                last_small = a[i];
            }
            else if( a[i] != last_small ){
                count = 1;
                last_small = a[i];
            }
            longest = Math.max( longest, count);
        }
        
        System.out.println(longest);

        // OPTIMAL
    }
}
