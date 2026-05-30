public class Day52_Book_Allocation {
    
    public static void main(String[] args) {
        
        int arr[] = { 25, 46, 28, 49, 24 };
        int k = 4;

        int min = arr[0];
        int sum = 0;
        for( int i = 0; i<arr.length; i++ ){

            sum = sum + arr[i];
            min = Math.max( min, arr[i]);
        }

        int low = min, high = sum;

        while( low <= high ){
            int mid = low + ( high - low )/2;

            // if possible
            int allocatedStud = 1, pages = 0;

            for( int i = 0; i<arr.length; i++ ){
                if( arr[i] > mid ){
                    System.out.println("false");
                }
                if( pages + arr[i] > mid ){
                    allocatedStud++;
                    pages = arr[i];
                }
                else{
                    pages += arr[i];
                }
            }

            // possible allocation
            if( allocatedStud <= k ){ // means allocation is possible ✅
                high = mid - 1; // Try minimizing more:
            }
            else{ 
                low = mid + 1;
            }
        }

        System.out.println(low);


    }
}
 