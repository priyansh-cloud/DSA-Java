
public class Day40_Search_X_in_sorted_array {
    
    public static int BinarySearch( int[] arr, int low,  int high, int target){

        if( low > high ){
            return -1;
        }

        int mid = ( low + high )/2;

        if( arr[mid] == target ){
            return mid;
        }
        else if( arr[mid] > target ){
            return BinarySearch(  arr,  mid+1,   high,  target);
        }
        else{
            return BinarySearch(  arr,  low,   mid-1,  target);
        }

    }

     public static int search( int[] arr, int target ){
             return BinarySearch(  arr, 0 , arr.length-1 , target);
        }


    public static void main(String[] args) {
        
        //!   iteration

        // int[] nums = {3, 4, 6, 7, 9, 12, 16, 17}; // sorted array
        // int target = 6;

        // int low = 0;
        // int high = nums.length-1;

        // while( low <= high ){

        //     int mid = ( low + high )/2;

        //     if( nums[mid] == target ){
        //         System.out.println(mid);
        //         break;
        //     }
        //     else if( target > nums[mid]){
        //         low = mid + 1;
        //     }
        //     else{
        //         high = mid-1;
        //     }
        // }


        //!       recursion

        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17}; // sorted array
        int target = 6;

        int ind = search(arr, target);

        if( ind == -1 ){
            System.out.println("not found ");
        }
        else{
            System.out.println(" found : " + ind);
        }

        

    }
       

}
