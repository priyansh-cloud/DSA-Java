

public class Day36_find_missing_and_repeating_no {
    
    public static void main(String[] args) {
        
        //!               brute
        //? TC -> O(N^2) && SC -> O(1)

        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};
        int repeating = -1;
        int missing = -1;

        // for(int i = 1; i <= nums.length; i++){

        //     int count = 0;
        //     for(int j = 0; j<nums.length; j++){
        //         if( nums[j] == i ){
        //             count++;
        //         }
        //     }

        //     if( count == 2 ) repeating = i;
        //     else if( count == 0 ) missing = i;

        //     if( repeating != -1 && missing != -1){
        //         break;
        //     }
        // }

        // System.out.println( " Repeating : " + repeating +  " " + " Missing : " + missing );



        //!               Better [ Hashing ]

        // int[] Hash = new int[ nums.length + 1];

        // for(int i = 0; i < nums.length; i++){
        //     Hash[ nums[i] ]++ ;
            
        // }

        // for(int i = 1; i <= nums.length; i++){
        //     if( Hash[i] == 2 ) repeating = i;
        //     else if( Hash[i] == 0 ) missing = i;

            
        //     // Stop early if both found
        //     if (repeating != -1 && missing != -1) {
        //         break;
        //     }
        // }

        // System.out.println( " Repeating : " + repeating +  " " + " Missing : " + missing );


        //!                 Optimal
        //? 1. Maths
        //? 2. XOR [ Typically harder ]

        //? 1.
        int n = nums.length;
        int sum;
        int sumN = n*(n+1)/2;
        
    }
}
