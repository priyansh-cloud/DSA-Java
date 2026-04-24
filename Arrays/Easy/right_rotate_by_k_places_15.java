public class right_rotate_by_k_places_15 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        k = k % n;
        int temp[] = new int[k];

        // fill the temp
        for(int i = 0; i<k; i++){
            temp[i] = arr[n-k+i];
        }

        //shifting --> right
        for(int i = n-k-1; i>=0; i--){ // n-k-1 = 7-3-1 = 3 -- 2-- 1-- 0
            arr[i+k] = arr[i]; // arr[6] = arr[3] ; arr[5] = arr[2]
        }

        // put temp on --> 7-3 = 4 => n-k
        for(int i = 0; i<k; i++){
             arr[i] = temp[i];
        }
       

        // print array
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
