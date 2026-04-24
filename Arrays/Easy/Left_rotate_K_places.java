public class Left_rotate_K_places {
    public static void main(String[] args) {
        
        int arr[] =  {1,2,3,4,5,6,7};
        int d = 3; // 0,1,2,3,4,5,6  d--> 4
        d = d % arr.length;
        int temp[] = new int[d]; 

        // Step 1: store first d elements in temp
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }
        // temp = [1,2,3]

       // Step 2: Shifting
        for(int i = d; i<arr.length; i++){
            // i = 3,4,5,6
            // shift index 3 --> 0
            arr[i-d] = arr[i];
           //   3-3 --> arr[0] = arr[3]  = 4  // arr[0] stores arr[3] value i.e 4 and so on
           //   4-3 --> arr[1] = arr[4]  = 5
           //   5-3 --> arr[2] = arr[5]  = 6
           //   6-3 --> arr[3] = arr[6]  = 7
        }
        // now the array will look like
        // [4,5,6,7,_,_,_ ]
        //  0,1,2,3,4,5,6 --> index

 
        // now ---> put the temp values in the remaining places in the array

        // Step 3: Put temp back
        // arr = [1,2,3,4,5,6,7]

        // loop will run from index 4 to 6
        // soo, 7-3 = 4 ==> arr.length(7) - d(3)

        for(int i = arr.length-d; i< arr.length; i++){
            // i = 4,5,6 --> 0,1,2
            arr[i] = temp[i-(arr.length - d)];
            // i - (arr.length - d) = 4 -(7 - 3) ==> 0th index what we want finally
            // i - (arr.length - d) = 5 -(7 - 3) ==> 1st index
            // i - (arr.length - d) = 6 -(7 - 3) ==> 2nd index
        }
        // final arr = [4,5,6,7,1,2,3]

        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
