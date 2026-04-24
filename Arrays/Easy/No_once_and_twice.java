public class No_once_and_twice {
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,3,3,4,4};
        int num;

        // -------------------->  Brute 
        // TC -> O(n^2)
        // SC -> O(1)
        // for(int i = 0; i<arr.length; i++){
        //     num = arr[i];
        //     int count =0; // reset
        //     for(int j = 0; j<arr.length; j++){
        //         if( num == arr[j] ){
        //             count++;
        //         }
        //     }
        //     if(count == 1 ){
        //         System.out.println(num);
        //     }
        // }


        // ---------------->  Better [ Hashing ]
        // TC -> O(3N)
        // SC -> O( max element )
        // int arr[] = {1,1,1,2,3,3,4,4,4};

        // step 1 : Find maximum element
        // int maxi = arr[0];
        // for(int i =0; i<arr.length; i++){        // O(n)
        //     maxi = Math.max(maxi, arr[i]);    // ----> SC -> O(max element)
        // }
    
        // // step 2: create hash array
        // int hash[] = new int[maxi +1];

        // // step 3: store frequency
        // for(int i = 0; i<arr.length; i++){  // O(n)
        //     hash[arr[i]] ++;   
        // }

        // // step 4: print elements with frequency 1
        // for(int i =0; i<arr.length; i++){       // O(n)
            
        //     if(hash[arr[i]] == 1){
        //         System.out.println(arr[i]);
        //     }
        
        // }
       

        // ---------------->  Optimal [ Xorr ]
        // TC -> O(N)
        // SC -> O(1)
        // int arr[] = {1,1,1,2,3,3,4,4,4};
        
        int xorr = 0;
        for(int i =0; i<arr.length; i++){
            xorr = xorr^arr[i];
        }
        System.out.println(xorr);
    }
}
