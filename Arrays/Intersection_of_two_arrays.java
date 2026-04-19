import java.util.ArrayList;

public class Intersection_of_two_arrays {
    public static void main(String[] args) {
        
        // Brute Force
        ArrayList<Integer> ans = new ArrayList<>();
       

        int arr1[] = {1,2,2,3,3,4,5,6}; // i loop
        int arr2[] = {2,3,3,4,5,6,6,7}; // j loop
        // vis[n2] = {0,0,0,0,0,0,0,0}  i = j => visv -> {1,0,0...}

        int n1 = arr1.length;
        int n2 = arr2.length;

        int vis[] = new int[n2] ; // all values = 0 by default

        // for(int i =0; i<n1; i++){
        //     for(int j =0; j<n2; j++){
        //         if(arr1[i] == arr2[j] && vis[j] == 0){
        //             ans.add(arr1[i]);
        //             vis[j] = 1;
        //             break;
        //         }
        //          if(arr2[j] > arr1[i]){
        //             break;
        //           }
        //     }
            
        // }

        //     System.out.println(ans);


            //            Optimal Approach ( 2 pointer )

            int i = 0;
            int j = 0;

            while(i<n1 && j<n2){
                if( arr1[i] < arr2[j]){ 
                    i++;
                }
                else if( arr2[j] < arr1[i]){
                    j++;
                }
                else{
                    ans.add(arr1[i]);
                    i++;
                    j++;
                    // System.out.println(ans);  too see the process
                }
            }
            System.out.println(ans);

            
        
    }
}
