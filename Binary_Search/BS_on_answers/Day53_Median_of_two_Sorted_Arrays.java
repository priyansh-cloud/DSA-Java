

public class Day53_Median_of_two_Sorted_Arrays {

    //!   OPtimal

     public static double median(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        // Always binary search on smaller array
        if(n1 > n2) {
            return median(arr2, arr1);
        }

        int left = (n1 + n2 + 1) / 2;
        int n = n1 + n2;

        int low = 0;
        int high = n1;

        while(low <= high) {

            int mid1 = low + (high - low) / 2;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            // right elements
            if(mid1 < n1) r1 = arr1[mid1];
            if(mid2 < n2) r2 = arr2[mid2];

            // left elements
            if(mid1 - 1 >= 0) l1 = arr1[mid1 - 1];
            if(mid2 - 1 >= 0) l2 = arr2[mid2 - 1];

            // correct partition found
            if(l1 <= r2 && l2 <= r1) {

                if(n % 2 == 1) {
                    return Math.max(l1, l2);
                }

                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            }

            else if(l1 > r2) {
                high = mid1 - 1;
            }

            else {
                low = mid1 + 1;
            }
        }

        return 0;
    }
    
    public static void main(String[] args) {
        
        //!         Brute

    //     int nums1[] = {1,3};
    //     int[] nums2 = {2};
    //     int n1 = nums1.length;
    //     int n2 = nums2.length;

    //    ArrayList<Integer> nums3 = new ArrayList<>();

    //     int i = 0;
    //     int j = 0;

    //     while( i < n1 && j < n2 ){

    //         if( nums1[i] < nums2[j] ){
    //             nums3.add( nums1[i++] );
    //         }
    //         else{
    //             nums3.add(nums2[j++] );
    //         }

    //     }
    //     while( i<n1 ){
    //         nums3.add( nums1[i++] );
    //     }
           
    //      while( j<n2 ){
    //         nums3.add(nums2[j++] );
    //     }
    //         int n = n1+n2;
        
    //         if(n % 2 == 1) {

    //     System.out.println(nums3.get(n / 2));
    // }
    // else {

    //     double median =
    //         (nums3.get(n / 2) + nums3.get(n / 2 - 1)) / 2.0;

    //     System.out.println(median);
    // }

    //     System.out.println(nums3);



        //!          Better

        // int nums1[] = {1,3};
        // int[] nums2 = {2};
        // int n1 = nums1.length;
        // int n2 = nums2.length;

        // int n = ( n1 + n2 );
        // int ind2 = n/2;
        // int ind1 = ind2 - 1 ;

        // int count = 0;

        // int ind1elm = -1;
        // int ind2elm = -1;

        // int i = 0;
        // int j = 0;

        // while ( i < n1 && j < n2 ){

        //     if( nums1[i] < nums2[j] ){
        //         if( count == ind1 ){
        //             ind1elm = nums1[i];
        //         }
        //         if( count == ind2 ){
        //             ind2elm = nums1[i];
        //         }
        //         count++;
        //         i++;
        //     }
        //     else{
        //         if( count == ind1 ){
        //             ind1elm = nums2[j];
        //         }
        //          if( count == ind2 ){
        //             ind2elm = nums2[j];
        //         }
        //         count++;
        //         j++;
        //     }

        // }

        // while ( i < n1 ) {

        //     if( count == ind1 ){
        //         ind1elm = nums1[i];
        //     }
        //      if( count == ind2 ){
        //             ind2elm = nums1[i];
        //         }
        //         count++;
        //         i++;
        // }

        // while ( j < n2 ){

        //      if( count == ind1 ){
        //             ind1elm = nums2[j];
        //         }
        //          if( count == ind2 ){
        //             ind2elm = nums2[j];
        //         }
        //         count++;
        //         j++;
        // }

        // if( n%2 == 1){
        //     System.out.println(ind2elm);
        //     return;
        // }

        // int ans = ( ind1elm + ind2elm )/2;
        // System.out.println( ans );


        //!             Optimal

        int[] arr1 = {1, 3};
        int[] arr2 = {2};

        System.out.println(median(arr1, arr2));
    
    }
}
