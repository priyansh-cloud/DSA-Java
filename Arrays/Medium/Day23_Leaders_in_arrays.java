import java.util.*;

public class Day23_Leaders_in_arrays {
    public static void main(String[] args) {


        // Brute : TC -> O(n^2)  &&  SC -> O(N)

        ArrayList<Integer> ans = new ArrayList<>();

        int[] nums = {1, 2, 5, 3, 1, 2};
        // for(int i = 0; i<nums.length; i++){

        //     boolean leader = true;

        //      for(int j = i+1 ; j<nums.length; j++){

        //         if(nums[i] < nums[j] ){
        //             leader = false;
        //             break;
        //         }
               
        //     }

        //      if( leader == true ){
        //         ans.add(nums[i]);
        //     }
        // }
            
        //     System.out.println(ans);


        // -----------------------> optimal : TC -> O(N) && Sc -> O(N)

        int maxi = Integer.MIN_VALUE;
        for(int i = nums.length - 1; i>=0; i--){
            if( nums[i] > maxi ){
                maxi = nums[i];
                ans.add(maxi);
            }
        }
        Collections.reverse(ans); /* Reverse the list to match the required output order */
        System.out.println(ans);













    }
}
