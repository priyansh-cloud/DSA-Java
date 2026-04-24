public class right_rotate_by_one_14 {
    public static void main(String[] args) {
        
         int arr[] = {1,2,3,4,5};
        int temp = arr[arr.length-1]; // temp = 5
        

        for(int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1]; // i = 0; arr[0+1] = arr[0] => arr[1] = 1
        }
        arr[0] = temp;

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }



    }
}
