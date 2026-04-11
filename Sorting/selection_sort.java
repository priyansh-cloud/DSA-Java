public class selection_sort {
    public static void main(String[] args) {
        
        int arr[] = {13,46,24,52,20,9};
        int min;
        int temp;

        for(int i =0; i<=arr.length-2; i++){  // outer loop checks no.of passes (why [arr.length-2] Because by the time we reach the last element, it is already sorted automatically.)
            min = i;  // min = 0 (13)

            for(int j =i; j<= arr.length-1; j++){  // inner loop compares and swaps
                if(arr[j] < arr[min]){
                    min = j;

                }
            }
              //swap
                    temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;

              System.out.println(arr[i]);
        }
      
    }

}
