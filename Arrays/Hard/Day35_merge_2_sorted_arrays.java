import java.util.Arrays;

public class Day35_merge_2_sorted_arrays {
    
    public static void main(String[] args) {
        
        //!                 brute

        // int[] nums1 = {1, 3, 5, 0, 0, 0};
        // int[] nums2 = {2, 4, 6};
        // int n = 3, m = 3;

        // int nums3[] = new int[ n+m ];
        
        // int left = 0;
        // int right = 0;
        // int index = 0;

        // // puting elements in 3rd array
        // while( left < n && right < m ){

        //     if( nums1[left] <= nums2[right] ){
        //         nums3[index] = nums1[left];
        //         left++; index++;
        //     }
        //     else {
        //         nums3[index] = nums2[right];
        //         right++; index++;
        //     }

        // }

        //  while( left < n ){
            
        //      nums3[index] = nums1[left];
        //         left++; index++;
        //    }

        //     while( right < m ){
            
        //      nums3[index] = nums2[right];
        //         right++; index++;
        //    }

        //    for(int i = 0; i<n+m; i++){
        //     if(i<n){
        //         nums1[i] = nums3[i];
        //     }
        //     else{
        //         nums2[ i-n ] = nums3[i];
        //     }

        //    }

        // System.out.println(Arrays.toString(nums3));



        //!                 Better

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int n = 3, m = 3;

        int left = arr1.length - 1;
        int right = 0;

        while ( left >= 0 && right < m ){

            if( arr1[left] > arr2[right]) {
                // swap
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;

                left--; right++;

            }
            else{
                break;
            }

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        //!                   optimal

        

    }
}
