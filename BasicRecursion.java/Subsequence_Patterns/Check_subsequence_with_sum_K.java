import java.util.ArrayList;

public class Check_subsequence_with_sum_K {

    public static void main(String[] args) {
        System.out.println(checkSubsequenceSum());
    }
    
    public static  boolean checkSubsequenceSum() {
        //your code goes here

        int nums[] = {1,2,3,4,5};
        int k = 8;

        int n = nums.length;

        // for checking subsequnce we don't need "ds" we can remove it also
        ArrayList<Integer> ds = new ArrayList<>();

        return f( 0, nums, ds, n, 0, k);
        
    }

    public static  boolean f( int indx, int[] nums, ArrayList<Integer> ds, int n, int sum, int k ){

        if( indx == n ){
            if( k == sum ){
                return true;
            }
            return false;
        }
        
        ds.add(nums[indx]);
        sum += nums[indx];

        if (f( indx + 1, nums, ds, n, sum, k ) ){ // pick
            return true;
        }

        ds.remove( ds.size() - 1 );
        sum -= nums[indx];

        if(f( indx + 1, nums, ds, n, sum, k ) ){ // not pick
            return true;
        }

        return false;


    }
}


