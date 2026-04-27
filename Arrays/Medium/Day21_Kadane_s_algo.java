public class Day21_Kadane_s_algo {
    public static void main(String[] args) {

        // Kadane's Algorithm is the true essence of "Even if you are at your lowest point, remember you're still a competition to someone."
        
        // int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // Brute : TC -> O(N^3)  &&  SC -> O(1)

        int maxi = Integer.MIN_VALUE;

        // for(int i = 0; i<arr.length; i++){

        //     for(int j = i; j<arr.length; j++){

        //         int sum = 0;
        //         for(int k = i; k<=j; k++){
        //             sum += arr[k];
                    
        //         }
        //         maxi = Math.max(maxi, sum);
        //     }
        // }
        // System.out.println(maxi);


        // ------------------------>   Better : TC -> O(N^2)  &&  SC -> O(1)

        //  for(int i = 0; i<arr.length; i++){

        //     int sum = 0;
        //     for(int j = i; j<arr.length; j++){
        //         sum += arr[j];
               
        //         maxi = Math.max(maxi, sum);
        //     }
        // }
        // System.out.println(maxi);

       
        // ------------------------>   optimal : TC -> O(N)  &&  SC -> O(1)

        // int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int sum = 0;
       
        // for(int i = 0; i<arr.length; i++){

        //     // Add current element to the sum
        //     sum += arr[i]; // 

        //     // Update maxi if current sum is greater
        //     if( sum > maxi){
        //         maxi = sum;
                
        //     }

        //     // Reset sum to 0 if it becomes negative
        //     if( sum < 0){ // only positive value, if -ve then sum = 0;
        //         sum = 0;
        //     }
            
        // }
        // // Return the maximum subarray sum found
        // System.out.println(maxi);




        // -----------------> if we want to print the longest subarray 

        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int sum = 0;
        int start = 0;
        int ans_end = -1; int ans_start = -1;
        for(int i = 0; i<arr.length; i++){

            if( sum ==0){
                start = i;
            }
            // Add current element to the sum
            sum += arr[i]; // 

            // Update maxi if current sum is greater
            if( sum > maxi){
                maxi = sum;
                ans_start = start;
                ans_end = i;
            }

            // Reset sum to 0 if it becomes negative
            if( sum < 0){ // only positive value, if -ve then sum = 0;
                sum = 0;
            }
            
        }

         for (int i = ans_start; i <= ans_end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

           // Return the maximum subarray sum found
        System.out.println(maxi);
    }
}
