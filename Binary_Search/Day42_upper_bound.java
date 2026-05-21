
public class Day42_upper_bound {
    public static void main(String[] args) {
        
        //?  Upper bound [ arr[i] > x ]

        //!         Optimal 

        int[] arr = {3, 5, 8, 9, 15, 19}; // Sorted array
        int x = 9;
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;

        while( low <= high ){

            int mid = ( low+high )/2;

            if( arr[mid] > x ){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(ans);

    }
}
