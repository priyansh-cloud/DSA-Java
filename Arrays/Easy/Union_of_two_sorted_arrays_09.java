import java.util.*;

public class Union_of_two_sorted_arrays_09 {
    public static void main(String[] args) {

        // ArrayList/ dynamic array --> used to resize array automatically
        ArrayList<Integer> union = new ArrayList<>();

        int arr1[] = {1,2,2,3,3,4,5,6};
        int arr2[] = {2,3,3,4,5,6,6,7};
        int n1 = arr1.length;
        int n2 = arr2.length;

        
        int i =0;
        int j =0;

        while( i < n1 && j < n2){
            if( arr1[i] < arr2[j]){ // arr1 chota h 
                if(union.size() == 0 || union.get( union.size()-1 ) != arr1[i]){ // last element != arr1
                    union.add(arr1[i]); // add arr1 --> union 
                }
                i++;
            }
            else if(arr1[i] > arr2[j]){  // arr2 chota h
                 if(union.size() == 0 || union.get( union.size()-1 ) != arr2[j]){ // last element != arr2
                    union.add(arr2[j]); // add arr2 --> union
                }
                j++;
            }
            
            else{ // arr1 = arr2
                 if(union.size() == 0 || union.get( union.size()-1 ) != arr1[i]){
                    union.add(arr1[i]); // add only one element --> arr1 or arr2 any 
                }
                i++;
                j++;
            }
        }

        while(j < n2){ // if arr1 gets over then contiune with arr2 elements 
            if(union.size() == 0 || union.get( union.size()-1 ) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        while(i < n1){ // if arr2 gets over then contiune with arr1 elements 
             if(union.size() == 0 || union.get( union.size()-1 ) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }

        System.out.println(union);


    }
}  
