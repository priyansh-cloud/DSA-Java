public class bubble_sort {
    
    public static void main(String[] args) {
        
        int arr[] = {13,46,24,52,20,9};
        int temp;

        for(int i =arr.length-1; i>=1 ; i--){
          
            for(int j =0; j<= i-1; j++){
                if(arr[j] > arr[j+1]){

                     //swap
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            
            }
        }
        for(int k =0; k< arr.length; k++){
            System.out.println(arr[k]);
        }
      
    }
}
