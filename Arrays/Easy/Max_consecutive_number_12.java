public class Max_consecutive_number_12 {
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,3,3,4,4};
        int num;

         for(int i=0; i<arr.length; i++){
            int count = 0;
            num = arr[i];

            for(int j =0; j<arr.length; j++){
                if(num==arr[j]){
                    count++;

                }
            }
            if(count == 1){
                System.out.println(num);
            }
         }
    }
}
