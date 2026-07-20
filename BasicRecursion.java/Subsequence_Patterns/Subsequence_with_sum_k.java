import java.util.ArrayList;

public class Subsequence_with_sum_k {
    
    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4,5};
        int k = 8;

        int n = nums.length;
        ArrayList<Integer> ds = new ArrayList<>();

        f( 0, nums, ds, n, 0, k);

    }

    public static void f( int indx, int[] nums, ArrayList<Integer> ds, int n, int sum, int k ){

        if( indx == n ){
            if( k == sum ){
                for( int i = 0; i<ds.size(); i++ ){
                    System.out.print(ds.get(i));
                }
                System.out.println();
            }
            return ;
        }

        // pick
        ds.add(nums[indx]);
        sum += nums[indx];
        f( indx + 1, nums, ds, n, sum, k );

        // not pick
        ds.remove( ds.size() - 1 );
        sum -= nums[indx];
        f( indx + 1, nums, ds, n, sum, k );


    }

}
