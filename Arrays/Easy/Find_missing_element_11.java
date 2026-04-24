public class Find_missing_element_11 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int n = arr.length;

        // Brute
        // TC -> O(N*N)
        // SC -> O(1)

        // for(int i = 1; i <= n+1; i++){
        //     int found = 0;
        //     for(int j = 0; j<n-1; j++){
        //         if( arr[j] == i ){
        //             found = 1;
        //             break;
        //         }
              
        //     }
        //     if( found == 0){
        //             System.out.println(i);
        //             break;
                    
        //         }

        // }


        // -------------->     Better Approach [ Hasing ]
        // TC -> O(N) + O(N) = O(2N)
        // SC -> O(N)

        // int hash[] = new int[n+2];
        
        // for(int i = 0; i< n; i++){
        //     hash[arr[i]] = 1;
            
        // }
        // for(int i = 1; i<= n+1 ; i++){
        //     if( hash[i] == 0 ){
        //         System.out.println(i);
        //         break;
        //     }
        // }


        // --------------->      Optimal Approach => SUM
        // TC -> O(N)
        // SC -> O(1)
        int sum = ((n+1) * (n+2))/2; // int arr[] = {1,2,4,5};
        int s2 = 0;
        for(int i =0; i<n; i++){
            s2 = s2+arr[i];
            
        }
         System.out.println(sum - s2);


          // --------------->      Optimal Approach => XOR
          // XOR one will do later as we will study about XOR in bit manipulation

    }
}
