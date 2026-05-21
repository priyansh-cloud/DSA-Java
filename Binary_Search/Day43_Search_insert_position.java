

public class Day43_Search_insert_position {
    
    public static void main(String[] args) {
        

        int[] nums = {1, 2, 4, 7};
        int target = 6;

        int len = nums.length;
        int low = 0;
        int high = len-1;
        int ans = len;

        while( low <= high ){
            int mid = ( low + high )/2;
            if( nums[mid] >= target ){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(ans);;
    }
}
