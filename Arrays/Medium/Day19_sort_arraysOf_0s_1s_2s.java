public class Day19_sort_arraysOf_0s_1s_2s {
    public static void main(String[] args) {
        
        // Brute [ Merge sort ]
        // TC -> O( n log n ) &&  SC -> O(n)

        // Better
        // TC -> O( 2N ) &&  SC -> O(1)
        
        int[] arr = {0, 2, 1, 2, 0, 1};

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // for(int i = 0; i<arr.length; i++){ // O(N)
        //     if(arr[i]==0) count0++;
        //     else if(arr[i]==1) count1++;
        //     else count2++;
        // }
        // for(int i =0; i<count0; i++){ // whole O(N)
        //     arr[i] = 0;
        //     System.out.println(arr[i]);
        // }

        // for(int i =count0; i<count0+count1; i++){
        //     arr[i] =1;
        //     System.out.println(arr[i]);
        // }

        // for(int i =count0+count1; i<arr.length; i++){
        //     arr[i]=2;
        //     System.out.println(arr[i]);
        // }


        // Optimal [ Dutch National Flag Algo... ]
        // TC -> O( N ) &&  SC -> O(1)

        // int[] arr = {0, 2, 1, 2, 0, 1};

        int low = 0; int mid = 0; int high = arr.length - 1;

        while( mid <= high ){

            if ( arr[mid] == 0){
                //swap( arr[low], arr[mid] )
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }
            else if ( arr[mid] == 1){
                mid++;
            }
            else{
                // if ( arr[mid] == 2)
                // swap( arr[mid], arr[high] )
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            
            }
        }

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
        //! to understand TC, in dry run try to count +1 in every iterations

        



    }
}
