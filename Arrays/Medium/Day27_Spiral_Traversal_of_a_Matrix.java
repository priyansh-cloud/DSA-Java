
import java.util.ArrayList;

public class Day27_Spiral_Traversal_of_a_Matrix {
    public static void main(String[] args) {
        
        ArrayList <Integer> ans = new ArrayList<>();
       

         int[][] matrix = {

            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 },
            { 13,14, 15, 16 }

        };

        int n = matrix.length ; // row
        int m = matrix[0].length; // col
        // matrix[0] → first row → [1, 2, 3, 4]
        // .length → number of elements in that row  ==> 4 columns → m = 4

        int left = 0, right = m-1;
        int top = 0, bottom = n-1;


    while( left <= right && top <= bottom){

        
        // right =  left → right
        for(int i = left; i<= right; i++){
            ans.add(matrix[top][i]);  // matrix[row][column]
        }     //                           first index → row       ||    row = top (fixed)
       //------------------------------  second index → column     ||    column = i (changing)
        top++;

        // bottom = top → bottom
        for(int i = top; i<= bottom; i++){
            ans.add(matrix[i][right]);
        }
        right--;

        // left = right → left
        if( top <= bottom ){
            for(int i = right; i>=left; i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
        }

        // top = bottom → top
        if( left <= right ){
            for(int i = bottom; i>=top; i--){
                ans.add(matrix[i][left]);
            }
            left++;
        }
    }


   
    System.out.print(ans);
   
        
    

    }
}
