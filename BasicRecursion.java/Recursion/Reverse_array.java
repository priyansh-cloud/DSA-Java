
public class Reverse_array {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,0,3,4};
        int n = arr.length;

        // rev(arr, 0, n - 1);

        rev_single_pointer(arr, 0, n);

        for( int i = 0; i<n; i++ ){
            System.out.print(arr[i] + " ");
        }



    }

    //! Recursion using Two pointers

    static void rev( int arr[], int l, int r ){

        if( l >= r ){
            return;
        }

        // swap
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        // recursive call
        rev(arr, l + 1, r - 1 );

    }

    //! Recursion using single pointer
    static void rev_single_pointer( int arr[], int i, int n ){

        if( i >= n/2 ){
            return;
        }

        // swap
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        // recursive call
        rev_single_pointer(arr, i + 1, n );

    }

}
