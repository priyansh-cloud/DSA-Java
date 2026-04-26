public class Day20_Majority_element {
    public static void main(String[] args) {
        
        // int[] arr = {2, 2, 1, 1, 1, 2, 2};

        // Brute : TC -> O(N^2) && SC -> O(1)

        // for(int i = 0; i<arr.length; i++){ // O(N)
        //     int count = 0; // reset for every i

        //     for(int j = 0; j<arr.length; j++){ // O(N)
        //         if(arr[i] == arr[j] ){
        //             count++;
        //         }
        //     }
        //     if( count > arr.length/2 ){
        //         System.out.println( count + " " + arr [i]);
        //         return;
        //     }
        // }


            // Hashing ( Hash map ) : TC -> O(N) && SC -> O(N)


            // ------------------->  Optimal : TC -> O( N ) && SC -> O( 1 )

            // Moore's Voting Algo...
            // step 1 : apply Moore's Voting Algo...
            // step 2 : verify the element in the array that it's majority or not

            int[] arr = {2, 2, 1, 1, 1, 2, 2, 2};
            int el = 0;
            int count = 0;
            // step 1
            for(int i = 0; i<arr.length; i++){

                if( count == 0){

                    count = 1;
                    el = arr[i];
                
                }
                // what if count != 0
                else if( el == arr[i] ){ // if arr[i] -> majority ( suppose )
                    count++;
                }
                else{
                    count--;
                }
                
            }
            // step 2: verify in the array
            int count1 = 0;
            for(int i =0; i<arr.length; i++){
                if( arr[i] == el ){
                    count1++;
                }
            }
            if( count1 > ( arr.length/2 ) ){
                System.out.println(el + " : is the majority element.");
            }
            else System.out.println("no majority element in the array.");
            

      
         
    }
}
