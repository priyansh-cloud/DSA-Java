public class Day56_find_peak_element_II {
    

    public static int maxEl( int[][] arr, int n, int m, int col ){

        
        int max = Integer.MIN_VALUE;
        int ind = -1;

        for( int i = 0; i<n; i++ ){

            if( arr[i][col] > max ){
                max = arr[i][col];
                ind = i;
            }
        }
        return ind;

    }
    public static void main(String[] args) {
        
        int[][] mat = {
            {4, 2, 5, 1, 4, 5},
            {2, 9, 3, 2, 3, 2},
            {1, 7, 6, 0, 1, 3},
            {3, 6, 2, 3, 7, 2}
        };

        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;

        while( low <= high ){

            int mid = low + ( high - low )/2;
            int row = maxEl(mat, n, m, mid);
            int left = mid - 1 >= 0 ? mat[row][mid-1] : -1;
            int right = mid + 1 < m ? mat[row][mid + 1] : -1;

            if( mat[row][mid] > left && mat[row][mid] > right ) {
                System.out.println( row + " " + mid );
                return;
            }
            else if( mat[row][mid] < left ) high = mid - 1;

            else low = mid + 1;
        }


    }
}
