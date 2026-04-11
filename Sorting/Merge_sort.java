import java.util.ArrayList;
import java.util.List;

public class Merge_sort {

// merge
public static void merge(int[] arr, int low, int mid, int high){

    // create temp array
    List<Integer> temp = new ArrayList<>();

    int left = low;
    int right = mid + 1;

    // merge both sorted arrays
    while( left <= mid && right <= high){

        if(arr[left] <= arr[right] ){
            temp.add(arr[left]);
            left++;

        }
        else{
            temp.add(arr[right]);
            right++;
        }
    }
    // if left/right elemets finished then copy paste remaining ones !

    // Add remaining left elements
     while( left <= mid ){
        temp.add(arr[left]);
        left++;
     }

    // Add remaining right elements
    while( right <= high ){
        temp.add(arr[right]);
        right++;
     }

    // Copy back to original array
     for(int i =low; i<= high; i++){
        arr[i] = temp.get( i-low );
     }

}
// mergeSort 
public static void mS(int[] arr, int low, int high){
    
    if(low >= high){
        return;
    }
    // find mid index
    int mid = (low + high)/2;

    // sort left
    mS(arr, low, mid);

    // sort right
    mS(arr, mid+1, high);

    // merge left - right halves
    merge(arr, low, mid, high);
}

    public static void main(String[] args) {
        
        int arr[] = {3,2,4,1,3};

        mS(arr,0, arr.length-1);
        
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
