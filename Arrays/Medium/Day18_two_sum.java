import java.util.*;
public class Day18_two_sum {
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        
        int k = 14;

        // ----------------------> brute
        for(int i = 0; i<arr.length; i++){ // O(n)
            for(int j = i+1; j<arr.length; j++){ // O(n)
                
                if( arr[i] + arr[j] == k ){
                    System.out.println(arr[i] + "," + arr[j]);
                    break;
                }
            }
        }

        // ----------------------> better [ HashMap ]

        // HashMap <Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i<arr.length; i++){
        //     int a = book[i];
        //     int more = k - a;
        //     if

        // }

        
    }
}
