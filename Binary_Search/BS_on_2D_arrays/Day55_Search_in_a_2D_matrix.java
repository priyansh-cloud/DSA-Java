

public class Day55_Search_in_a_2D_matrix {
    
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int target = 8;

        int m = matrix.length; // rows
        int n = matrix[0].length; // cols

        int low = 0; int high = m * n - 1;

        while( low <= high ){

            int mid = low + ( high - low )/2;
            int row = mid / n;
            int col = mid % n;

            if( matrix[row][col] == target ){
                System.out.println("true");
                return;
            }
            else if( matrix[row][col] > target ){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        System.out.println(" false ");

    }
}
