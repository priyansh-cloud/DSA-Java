public class Day56_Search_in_2D_matrix_II {
    
    public static void main(String[] args) {
        
        //!                     Optimal

        int[][] mat = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        int tar = 50;
        int m = mat.length; // rows
        int n = mat[0].length; // cols

        // Start from top-right corner
        int row = 0;
        int col = n - 1;

        while( row < m && col >= 0 ){

            if( mat[row][col] == tar ){
                System.out.println("true");
                return;
            }
            // Current element is too large,
            // move left to smaller values
            else if( mat[row][col] > tar) col--;
            
            else row++;
        }

        System.out.println("false");

    }
}
