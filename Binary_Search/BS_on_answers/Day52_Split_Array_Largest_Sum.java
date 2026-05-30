public class Day52_Split_Array_Largest_Sum {
    
    public static void main(String[] args) {
        
        int nums[] = {7,2,5,10,8};
        int k = 2;

        int n = nums.length;
        int max = nums[0];
        int sum = 0;
        
        // find sum(array) and max
        for( int i = 0; i<n; i++ ){

            sum += nums[i];
            max = Math.max( max, nums[i] );

        }
        
        int low = max;
        int high = sum;

        while( low <= high ){

            int mid = low + ( high - low )/2;

            int subarrays = 1;
            int currentSum = 0;

            for( int i = 0; i<n; i++ ){

                if( currentSum + nums[i] > mid ){ //Current subarray exceeded allowed sum.
                    subarrays++; // Start new subarray.
                    currentSum = nums[i];
                }

                else{
                    currentSum += nums[i];
                }
            }

            if( subarrays > k ){  // Too many subarrays needed.
                low = mid + 1; // So mid too small. Increase limit:
            }

            else{
                high = mid - 1;
            }
        }

        System.out.println(low);;


    }
}
