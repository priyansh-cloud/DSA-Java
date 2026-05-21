
public class Day45_Count_occurrences_in_Array {
    
    public static void main(String[] args) {
        
        int[] nums =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, target = 8;

        int low = 0;
        int high = nums.length-1;

        // First position
        int first = -1;

        while( low <= high ){
            int mid = ( low + high )/2;
            if( nums[mid] < target ){
                low = mid+1;
            }
            else if( nums[mid] > target ){
                high = mid-1;
            }
            else{ // nums[mid] = target 
                first = mid;
                high = mid-1;
            }
        }

        // reset
         low = 0;
         high = nums.length-1;

        // Last Position
         int last = -1;

        while( low <= high ){
            int mid = ( low + high )/2;
            if( nums[mid] < target ){
                low = mid+1;
            }
            else if( nums[mid] > target ){
                high = mid-1;
            }
            else{ // nums[mid] = target 
                last = mid;
                low = mid+1;
            }
        }
        System.out.println( last - first + 1 );
        
    }
}
