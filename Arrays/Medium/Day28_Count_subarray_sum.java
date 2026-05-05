
import java.util.*;

public class Day28_Count_subarray_sum  {
    public static void main(String[] args) {
        
        //              Brute : TC -> O(n^3) && SC O(1)

        // int[] arr = {3, 1, 2, 4};
        // int target = 6;
        // int count = 0;

        // for(int i = 0; i<arr.length; i++){
        //     for(int j = i; j<arr.length; j++){ 
        //         int sum = 0; 
        //         for(int k = i; k<=j; k++){ 
        //             sum = sum + arr[k]; 
                    
        //         }
        //         if(sum==target){
        //             count++;
        //         }
                
        //     }
        // }
        // System.out.println(count);




         //              Better : TC -> O(n^2) && SC O(1)

        //  int[] arr = {3, 1, 2, 4};
        //  int target = 6;
        //  int count = 0;

        //  for(int i = 0; i<arr.length; i++){

        //     int sum = 0;
        //     for(int j = i; j<arr.length; j++){
               
        //             sum = sum + arr[j];
        //             if(sum==target){
        //             count++;
                
        //         }
                
        //     }
        // }
        // System.out.println(count);



        //              Optimal [ Prefix sum => HashMap ]
        //              TC -> O(n^2) && SC O(1)

        int[] arr = {3, 1, 2, 4};
        int target = 6;
        int count = 0;

        HashMap <Integer, Integer> map = new HashMap<>();
        int PrefixSum = 0;

        map.put(0,1);

        for(int i = 0; i<arr.length; i++ ){
            PrefixSum = PrefixSum + arr[i];
            int remove = PrefixSum - target;
            
            if( map.containsKey(remove)) {

                count += map.get(remove);

            }
            map.put(PrefixSum, map.getOrDefault(PrefixSum, 0) + 1);
        }


        System.out.println(count);




    }
}
