public class Day33_count_subarrays_with_xor {
    public static void main(String[] args) {
        
        //!                     Brute

        // int[] A = {4, 2, 2, 6, 4};

        // int target = 6;
        // int count = 0;

        // for (int i = 0; i < A.length; i++) {
            
        //     for (int j = i; j < A.length; j++) {

        //         int XOR = 0;
        //         for (int k = i; k <= j; k++) {
                    
        //             XOR = XOR^A[k];
                    
        //         }
        //         if( XOR == target ){
        //                 count++;
        //             }
            
        //     }
        
        // }
        // System.out.println(count);


        //!                   Better

        int[] A = {4, 2, 2, 6, 4};

        int target = 6;
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            
            int XOR = 0;
            for (int j = i; j < A.length; j++) {

                XOR = XOR^A[j];
                if( XOR == target ){
                count++;
                }
            }
            
        
        }
        System.out.println(count);

    }
}
