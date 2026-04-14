public class basic_array {
    
    public static void main(String[] args) {

        // find the largest number in the array

        int arr[] = {2,4,1,6,9};

        int largest = arr[0];
        

        for(int i =0; i< arr.length; i++){
            if(arr[i] > largest){
                
                largest = arr[i];
            }
        }
        System.out.println("largest no. is = " + largest);
        
        
        
        
        
    }

}
