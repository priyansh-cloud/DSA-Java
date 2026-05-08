
import java.util.*;


public class Day31_3_sum {
    public static void main(String[] args) {

        //!                             Brute : TC -> O(n^3) && SC -> O(2 * no. of the unique triplets)
        
          // Store unique triplets
        //  Set<List<Integer>> st = new HashSet<>();

        //  int[] arr = {-1, 0, 1, 2, -1, -4};
        //  for(int i = 0; i<arr.length; i++){

        //     for(int j = i+1; j<arr.length;j++){

        //         for(int k = j+1; k<arr.length; k++){
        //             if( arr[i] + arr[j] + arr[k] == 0 ){

        //                 // Store sorted triplet to avoid duplicates
        //                 List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]); // [-1, -1, 2], [-1, 0, 1]
        //                 Collections.sort(temp);
        //                 st.add(temp); // [ [-1, -1, 2], [-1, 0, 1] ]
                    
        //             }
        //         }
        //     }
        //  }
        //  System.out.println(st);


        //!                             Better : [ Hashing ]

        // TC -> O(n^2) && SC -> O(2 * no. of the unique triplets)


        // Store unique triplets
        // Set<List<Integer>> ans = new HashSet<>();
        // int[] arr = {-1, 0, 1, 2, -1, -4};

        // for(int i = 0; i<arr.length; i++){

        //     // Set to store elements seen in this iteration
        //     Set<Integer> hashset = new HashSet<>();
        //     for(int j = i+1; j<arr.length;j++){

        //         int third = - ( arr[i] + arr[j] );
        //         if ( hashset.contains(third)){

        //             List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
        //             Collections.sort(temp);
        //             ans.add(temp);

        //         }
        //         // Add current element to set
        //         hashset.add(arr[j]);

        //     }
        // }

        // System.out.println(ans);
        

         //!                             Optimal : 2 Pointers
         // Tc -> O(n log n) + O(n*n)
         // Sc -> O( no. of triplets )

        
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for( int i = 0; i<arr.length; i++ ){

            if( i>0 && arr[i] == arr[i-1] ) continue; // simply i++

            int j = i+1;
            int k = arr.length - 1;

            while( j<k ){

                int sum = arr[i] + arr[j] + arr[k];
                if( sum < 0 ){
                    j++;
                }
                else if( sum > 0 ){
                    k--;
                }
                else{  // sum = 0

                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while( j < k && arr[j] == arr[ j-1 ]) j++;
                    while( j < k && arr[k] == arr[ k+1 ]) k--;
                }
            }

        }

        System.out.println(ans);


    }
}
