
import java.util.*;



public class Day30_Majority_Element_II {
    
    public static void main(String[] args) {
        
        //                Brute : TC -> O(N^2) && SC -> o(2)
        // int[] arr = {11, 33, 33, 11, 33, 11};
        // List<Integer> ans = new ArrayList<>();
        
        // for(int i = 0; i<arr.length; i++ ){

        //     if(ans.contains(arr[i])) continue;
        //     int count = 0;
        //     for(int j = 0; j<arr.length; j++ ){
        //         if(arr[i] == arr[j] ){
        //             count++;
        //         }
        //     }
        //     if(count > arr.length/3 ){
        //         ans.add(arr[i]);
        //     }

        //      if( ans.size() == 2 ){
        //     break;
        // }
        // }
        
        // System.out.println(ans);




        //                    Better [ Hashing] 
        //                  TC -> O(n) && SC -> O(n)

        int[] nums = {11, 33, 33, 11, 33, 11};
        HashMap<Integer,Integer> mpp = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        int min = ( nums.length/3 ) + 1;

        for(int i = 0; i<nums.length; i++ ){

            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);

            if( mpp.get(nums[i]) == min ){
                ls.add(nums[i]);
            }
        }
        Collections.sort(ls);
        System.out.println(ls);

        
         //                    Optimal








    }
}
