public class Left_rotate {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int temp = arr[0]; // temp = 1

        // First loop = modify array
        for(int i =1; i<arr.length; i++){  
            arr[i-1] = arr[i];          // Shift left
        }
        // after loop [2, 3, 4, 5, 5]

         arr[arr.length-1] = temp; // Put first element at end

         //Second loop = print array
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
        
    }
}
