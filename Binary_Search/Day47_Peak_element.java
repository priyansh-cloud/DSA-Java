

public class Day47_Peak_element {
    public static void main(String[] args) {
        
        int[] nums = {1,2,1,3,5,6,4};

        int n = nums.length;

        if( n==1 ) System.out.println(0);
        if( nums[0] > nums[1]) System.out.println(0);
        if( nums[n-1] > nums[n-2] ) System.out.println(n-1);

        int low = 1, high = n-2;

        while( low <= high ){
            int mid = ( low + high )/2;

            // For Peak
            if( nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1] ){
               System.out.println(mid);
               return;
            }
            // Left half
            else if( nums[mid] > nums[mid-1] ){ // Increasing --> peak on right side
                low = mid + 1; // move right and trim left search space
            }
            // Right half
            else if( nums[mid] > nums[mid+1] ){ // Decreasing --> peak on left side
                high = mid - 1; // move left and trim right search space
            }
            // For multiple peaks
            else{
                low = mid + 1;
            }
        }
        System.out.println(-1);
    }
}
