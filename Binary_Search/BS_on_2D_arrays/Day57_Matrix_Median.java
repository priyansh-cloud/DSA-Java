public class Day57_Matrix_Median {
    
public static int UB( int arr[], int x){
    
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
        

    return ans;
}
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };

        int n = matrix.length; // rows
        int m = matrix[0].length; // cols

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for( int i = 0; i<n; i++ ){
            low = Math.min( low, matrix[i][0]);
            high = Math.max( high, matrix[i][m-1]);
        }

         int req = (n * m) / 2;

         while( low <= high ){

            int mid = low + ( high - low )/2;

            int count = 0;
             // Count elements <= mid
            for( int i = 0; i< n; i++ ){

                count += UB(matrix[i], mid);
                
            }
             if (count <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
         }

         System.out.println("Median = " + low);

    }
}
