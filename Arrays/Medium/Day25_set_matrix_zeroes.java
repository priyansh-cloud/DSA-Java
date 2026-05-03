public class Day25_set_matrix_zeroes {
    
    public static void main(String[] args) {
        
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;

                }
            }
        }


         for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if( row[i] || col[j] ){
                    matrix[i][j] = 0;

                }
            }
        }

         for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
         }



    }
}
