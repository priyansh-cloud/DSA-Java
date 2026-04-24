public class Check_array_sorted_03 {
    
    public static void main(String[] args) {
        
        int arr[] = {2,3,4,5,6,7 };
        
        for(int i = 0; i<= arr.length-2; i++){
            if( arr[i] <= arr[i+1]);
            else {
                System.out.println("not sorted");
            }
        }
        System.out.println("sorted");
    }
}
