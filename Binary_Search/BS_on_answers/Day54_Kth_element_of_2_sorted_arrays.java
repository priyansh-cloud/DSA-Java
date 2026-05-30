public class Day54_Kth_element_of_2_sorted_arrays {
    

    //!   OPtimal

     public static double Kth_element(int[] arr1, int[] arr2, int k) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        // Always binary search on smaller array
        if(n1 > n2) {
            return Kth_element(arr2, arr1, k);
        }

        int left = k;
        int n = n1 + n2;

        int low = Math.max( 0, n2 - k);
        int high = Math.min( k, n1 );

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

                return Math.max(l1, l2);

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
        
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;

        System.out.println("The " + k + "-th element of two sorted arrays is: " +
            Kth_element(arr1, arr2, k));

    }
}
