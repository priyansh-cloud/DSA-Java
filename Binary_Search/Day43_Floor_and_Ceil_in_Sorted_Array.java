

public class Day43_Floor_and_Ceil_in_Sorted_Array {
    
    public static void main(String[] args) {
        
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int low = 0;
        int high = arr.length-1;
        int floor = -1;

        while( low <= high ){
            int mid = ( low + high )/2;

            // Floor
            if( arr[mid] <= x ){
                floor = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        

        // reset
        low = 0;
        high = arr.length - 1;

        // Ceil
        int ceil = -1;
        while( low <= high ){
            int mid = ( low + high )/2;

            if( arr[mid] >= x ){
                ceil = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        System.out.println("Floor : " + arr[floor]);
        System.out.println("Ceil : " + arr[ceil]);
    }
}
