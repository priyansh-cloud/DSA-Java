

public class Day46_how_many_times_array_rotated {
    
    public static void main(String[] args) {
        
        int[] arr = {4,5,6,7,0,1,2,3};
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int ind = -1;

       while(low <= high){

    // already sorted
    if(arr[low] <= arr[high]){

        if(arr[low] < ans){
            ans = arr[low];
            ind = low;
        }

        break;
    }

    int mid = (low + high) / 2;

    // left half sorted
    if(arr[low] <= arr[mid]){

        if(arr[low] < ans){
            ans = arr[low];
            ind = low;
        }

        low = mid + 1;
    }

    // pivot in left side
    else{

        if(arr[mid] < ans){
            ans = arr[mid];
            ind = mid;
        }

        high = mid - 1;
    }
}

    System.out.println("Rotated " + ind + " times");
    
    }
}
