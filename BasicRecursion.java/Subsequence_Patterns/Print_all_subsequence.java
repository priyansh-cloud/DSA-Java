
import java.util.ArrayList;



public class Print_all_subsequence {
    
    public static void main(String[] args) {
        
        int arr[] = {3,1,2};
        int n = arr.length;

        ArrayList<Integer> ds = new ArrayList<>(); // ds -> data structure
        printf(0, arr, ds, n);
        
    }

    static void printf( int ind, int arr[], ArrayList<Integer> ds, int n ){

        if( ind >= n ){

            System.out.print("[ ");

            for( int i = 0; i<ds.size(); i++ ){
                System.out.print( ds.get(i) + " " );
            }
            System.out.print("]");
            System.out.println();

            return;
        }

        ds.add(arr[ind]); //  ds => data structure
        printf(ind + 1, arr, ds, n); // => take

        ds.remove(ds.size() - 1);
        printf( ind + 1, arr, ds, n); // => not take


    }

}
