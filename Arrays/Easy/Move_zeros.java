public class Move_zeros {
    public static void main(String[] args) {
        
        int a[] = {1,0,2,3,2,0,0,4,5,1};
        
        int j = -1;
        // step 1 --> place j
        for(int i =0; i<a.length; i++){
            if(a[i] == 0 ){ // 1 = 0 -> x , 0 = 0 break 
                j = i; // j = 0
                break;
            }
        }

        if(j == -1) return;  // If no zero → nothing to move

        // step 2 --> Compare
        for(int i = j + 1; i<a.length; i++){ // j = 0 then i = next element of j
            if( a[i] != 0 ){ // next element of j should != 0 then swap
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                j++;
            }
        }

        // run array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
