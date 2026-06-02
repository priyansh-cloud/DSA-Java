
public class Day55_row_with_maximum_number_of_1_s {
    
    public static int LowerBound( int[] arr, int m){

        int low = 0;
        int high = m - 1;
        int ans = m;

        while( low <= high ){

            int mid = low + ( high - low )/2;

            if( arr[mid] >= 1 ){
                ans = mid;
                high = mid - 1;

            }
            else{
                low = mid + 1;
            }

        }

        return ans;
    }
    public static void main(String[] args) {
        
        //!             Brute

        int[][] matrix = {{1, 1, 1}, {0, 0, 1}, {0, 0, 0}};
        int n = 3, m = 3;

        // int ind = -1;
        // int max_count = -1;
        // for( int i = 0; i<n; i++ ){

        //     int count_row = 0;

        //     for( int j = 0; j<m; j++ ){
        //         count_row += matrix[i][j];
        //     }

        //     if(count_row > max_count) {
        //     max_count = count_row;
        //     ind = i;
        //     }
        // }
        // System.out.println(ind);


        //!                 Optimal [ Lower Bound ]

       int ind = -1;
       int max_count = 0;

       for( int i = 0; i<n; i++ ){

        int count_ones = m - LowerBound(matrix[i], m);
        
        if( count_ones > max_count ){
            max_count = count_ones;
            ind = i;
        }

       }

       System.out.println(ind);

    }
}
