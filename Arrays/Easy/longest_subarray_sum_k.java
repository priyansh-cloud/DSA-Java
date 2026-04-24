public class longest_subarray_sum_k {
    public static void main(String[] args) {
        
        // int arr[] = {1,2,3,1,1,1,1,4,2,3};
        // int k = 6;
        // int len = 0;

        //      ----------------->   Brute  [ TC - O(N^3)]

        // for(int i = 0; i<arr.length; i++){  // outer loop --> starting inex

        //     for(int j =i; j<arr.length; j++){  // middle loop --> ending index

        //         int sum = 0; // reset for evry i,j

        //         for( int p = i; p<=j; p++){  // inner loop --> sum the subarray from i-j
        //             sum += arr[p];
        //         }
        //         if(sum == k){  // condition check 
        //             len = Math.max(len, j-i+1);
        //         }
        //     }
        // }
        // System.out.println(len);

        //    ----------------->  TC - O(N^2)

        //  for(int i = 0; i<arr.length; i++){  // outer loop --> starting inex

        //     int sum = 0; // reset for evry i

        //     for(int j =i; j<arr.length; j++){  // middle loop --> ending index

        //             sum += arr[j];  // sum = sum + arr[j]
                
        //         if(sum == k){  // condition check 
        //             len = Math.max(len, j-i+1);
        //         }
        //     }
        // }
        // System.out.println(len);


         //    ----------------->  Better [ hashing ]
         // int arr[] = {1,2,3,1,1,1,1,4,2,3};



         //    ----------------->  Optimal [ 2 pointer ]
         // TC -> O(2N)
         // SC -> O(1)

         int arr[] = {1,2,3,1,1,1,1,1,3,3};
         int k = 6;
         int left = 0;
         int right = 0;
         int sum = arr[0];
         int maxlen = 0;

         while( right < arr.length){  // O(N)

            while(left <= right && sum > k){ // O(N) --> Overall
                sum -= arr[left]; // if sum > k then sub the array from left
                left++; // shrink from left
            }

            if(sum == k){
                maxlen = Math.max(maxlen, right - left +1); // update maxlen
            }

            right ++; // 1st move then add

            if(right<arr.length){ // add under the boundary/array
                sum += arr[right]; // sum = sum + arr[right]
            }
            
         }

         System.out.println(maxlen);
         

    }
}
