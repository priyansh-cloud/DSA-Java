import java.util.*;

public class Day18_two_sum {
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        
        int k = 14;

        // ----------------------> brute
        // for(int i = 0; i<arr.length; i++){ // O(n)
        //     for(int j = i+1; j<arr.length; j++){ // O(n)
                
        //         if( arr[i] + arr[j] == k ){
        //             System.out.println(arr[i] + "," + arr[j]);
        //             break;
        //         }
        //     }
        // }

        // ----------------------> better [ HashMap ] TC -> O(N), SC -> O(N)

        HashMap <Integer, Integer> map = new HashMap<>();
        //      < need , i (index) >

        for(int i = 0; i<arr.length; i++){
            int need = k - arr[i];

             // If need found, return indices
            if( map.containsKey(need)){ // 1st check
              
                System.out.println(  map.get(need) + " " + i );
                return;
            }
             // Store current element and index in hashmap
            map.put(arr[i], i); // then move the elements into the map 
            
        }
        System.out.println("not found");


    

        
    }
}
