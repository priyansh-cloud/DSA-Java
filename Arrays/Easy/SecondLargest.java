public class SecondLargest {
    public static void main(String[] args) {
        // 1st pass largest
        int arr[] = {1,2,4,7,7,5,6};

        int largest = arr[0];
        for(int i =0; i< arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i]; // update largest
            }
        }
        System.out.println("largest = " + largest);


        // 2nd largest
        int Slargest = -1; // assuming no -ve values
        
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > Slargest && arr[i] != largest ){
                Slargest = arr[i];
            }
        }
        System.out.println("2nd largest = "+ Slargest);
    }
}
