public class Duplicate_array_04 {
    
    public static void main(String[] args) {
        
        int i = 0;
        int arr[] = {0,0,1,1,2,3,3};

        for(int j=1; j<arr.length; j++){
            if( arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        // After this, array becomes: [0, 1, 2, 3, 2, 3, 3]
       
       
        for(int k=0; k<=i; k++){
            System.out.println(arr[k]); 
        }
        // [0, 1, 2, 3]

        
    }
}
