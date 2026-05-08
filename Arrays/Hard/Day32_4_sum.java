import java.util.*;

public class Day32_4_sum {
    
    public static void main(String[] args) {
        
        // int[] arr = {1, 0, -1, 0, -2, 2};
        // int target = 0;
        // List<List<Integer>> ans = new ArrayList<>();

        //!                Brute 
        //?     TC -> O( n^4 ) && SC -> O( no. of quadruplets ) * 2

        // for(int i = 0; i<arr.length; i++ ){
        //     for(int j = i+1; j<arr.length; j++ ){
        //         for(int k = j+1; k<arr.length; k++ ){
        //             for(int l = k+1; l<arr.length; l++ ){

        //                 int sum = arr[i] + arr[j] + arr[k] + arr[l];
        //                 if( sum == target ){
        //                     List<Integer> temp = Arrays.asList(arr[i] , arr[j] , arr[k] , arr[l]);
        //                     Collections.sort(temp);
        //                     ans.add(temp);

        //                 } 
        //             }
        //         }
        //     }
        // }

        // System.out.println(ans);


        
        //!                Better [ Hashing ] 

        // int[] arr = {1, 0, -1, 0, -2, 2};
        // int target = 0;
        
        // Set<List<Integer>> ans = new HashSet<>();
        // why not : List<List<Integer>> ans = new ArrayList<>(); -> used when duplicates must be avoided automatically.

        // for(int i = 0; i<arr.length; i++ ){
        //     for(int j = i+1; j<arr.length; j++ ){

        //         HashSet <Integer> seen = new HashSet<>();

        //         for(int k = j+1; k<arr.length; k++ ){
                    
        //                 int sum = arr[i] + arr[j] + arr[k]  ;
        //                 int fourth = target - sum ;

        //                 if( seen.contains(fourth) ){
        //                     List<Integer> temp = Arrays.asList(arr[i] , arr[j] , arr[k], fourth );
        //                     Collections.sort(temp);
        //                     ans.add(temp);

        //                 } 
        //                 seen.add(arr[k]); // stores previously visited elements in current iteration.
                    
        //         }
        //     }
        // }

        // System.out.println(ans);



         //!                Optimal 
         //?    TC -> O(n³) && SC -> O(no. of quards )

        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        Arrays.sort(arr);
        Set<List<Integer>> ans = new HashSet<>();

        for(int i = 0; i<arr.length; i++ ){

            if( i>0 && arr[i] == arr[i-1] ) continue; // if true then continue, don't go down just do i + 1;

            for(int j = i+1; j<arr.length; j++ ){

                if( j != i + 1 && arr[j] == arr[j-1]) continue;

            int k = j + 1;
            int l = arr.length - 1;

            while( k < l ){
                int sum = arr[i] + arr[j] + arr[k] + arr[l];

                if( sum < target ){
                    k++;
                    
                }
                else if ( sum > target ){
                    l--;
                }
                else{ // sum == target
                    List<Integer> temp = Arrays.asList( arr[i] , arr[j] , arr[k] , arr[l] );
                    ans.add(temp);
                    k++;
                    l--;
                    
                    while( k<l && arr[k] == arr[k-1]) k++;
                    while( k<l && arr[l] == arr[l+1]) l--; 
                }

            }
            }
        }

        System.out.println(ans);

    }
}
