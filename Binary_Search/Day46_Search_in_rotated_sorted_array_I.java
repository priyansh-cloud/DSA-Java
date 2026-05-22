
public class Day46_Search_in_rotated_sorted_array_I {
    public static void main(String[] args) {
        
        //!        Brute [ Linear Seaarch ]
        //?        TC -> O( n )
        // int[] nums = {4, 5, 6, 7, 0, 1, 2};
        // int target = 0;

         // Loop through each element in the array
        // for (int i = 0; i < nums.length; i++) {

        //     // If current element matches target, return index
        //     if (nums[i] == target) {
        //         System.out.println(i);
        //         return;
        //     }
           
        // }

        // // If not found, return -1
        // System.out.println(" not found");



        //!            Optimal [ Binary Search ]

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int low = 0;
        int high = nums.length - 1;

        while( low <= high ){
            int mid = ( low + high )/2;

            if( nums[mid] == target ){
                System.out.println(mid);
                return;
            }

            // Left side is sorted
            if( nums[low] <= nums[mid] ){

                // figure out if target lies on left half
                if( nums[low] <= target && target < nums[mid] ){
                    high = mid-1;
                }

                else{
                    low = mid + 1;
                }
            }

            // Right side is sorted
            else{
                
                if( nums[mid] < target && target <= nums[high] ){
                    low = mid + 1;
                }

                else{
                    high = mid - 1;
                }
            }
            
        }
        System.out.println(" not found ");


        


    }
}
