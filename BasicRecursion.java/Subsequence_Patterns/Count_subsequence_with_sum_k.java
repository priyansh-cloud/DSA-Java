

public class Count_subsequence_with_sum_k {
    
    public static void main(String[] args) {
        System.out.println(checkSubsequenceSum());
    }
    
    public static  int checkSubsequenceSum() {
        //your code goes here

        int nums[] = {1,2,3,4,5};
        int k = 8;

        int n = nums.length;

        return f( 0, nums, n, 0, k);
        
    }

    public static int f( int indx, int[] nums, int n, int sum, int k ){

        if( indx == n ){
            if( k == sum ){
                return 1;
            }
            else return 0;
        }

        sum += nums[indx];
        int left = f( indx + 1, nums, n, sum, k );// pick
    
        sum -= nums[indx];
        int right = f( indx + 1, nums, n, sum, k ); // not pick

        return left + right;
    }
}
