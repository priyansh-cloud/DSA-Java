

public class Day44_First_and_Last_occurrence_in_a_sorted_array {
    
    public static void main(String[] args) {
        
        //!              Brute : TC -> O(n)

        // int arr[] = {3, 4, 13, 13, 13, 20, 40};
        // int first = -1;
        // int last = -1;
        // int x = 13;

        // for( int i = 0; i<arr.length; i++ ){

        //     if( arr[i] == x ){
        //         if( first == -1 ){
        //             first = i;
                    
        //         }
        //         last = i;
        //     }
        // }
        // System.out.println( "F : " + first + " & " + "L : " + last);



        //!              Optimal[ Binary Search ]

        //?          1 : Lower and Upper BOund

        // int arr[] = {3, 4, 13, 13, 13, 20, 40};
        // int first = -1;
        // int last = -1;
        // int x = 13;
        
        // int low = 0;
        // int high = arr.length-1;
        // int ans = arr.length;

        // //? Lower bound
        //  while( low <= high ){

        //     int mid = ( low+high )/2;

        //     if( arr[mid] >= x ){
        //         ans = mid;
        //         high = mid-1;
        //     }
        //     else{
        //         low = mid+1;
        //     }
        // }
        

        // //? Upper Bound
        // low = 0; // resset
        // high = arr.length-1;

        // int ans1 = arr.length;
        //  while( low <= high ){

        //     int mid = ( low+high )/2;

        //     if( arr[mid] > x ){
        //         ans1 = mid;
        //         high = mid-1;
        //     }
        //     else{
        //         low = mid+1;
        //     }
        // }

        // if( ans == arr.length || arr[ans] != x ){
        //     System.out.println("-1 -1");
        // }
        // else{
        //     first = ans;
        //     last = ans1-1;

        //     System.out.println("First : " + first);
        //     System.out.println("Last : " + last);
        // }


        //?                2 : simple Binary Search without LB and UB.


        int nums[] = {3, 4, 13, 13, 13, 20, 40};
        int target = 13;
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
        System.out.println("First : " + first);
        System.out.println("Last : " + last);
       
    }
}
