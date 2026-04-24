public class Max_consecutive_ones_13 {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1};
        int maxi = 0;
        int count = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i] == 1){ // [0] = 1, [1] = 1, [2] = 0, [3] = 1, [4] = 1,...

                // increases & resets
                count ++; // 1 -> 2 -> reset = 0 -> 1

                // only increases or stays same
                maxi = Math.max(maxi,count); // (1,1) -> (2,2) -> (2,0) --> (2,1) ->... (3,3)
            }
            else{
                count = 0; //  reset when 0 comes
            }
        }
        System.out.println(maxi);
    }
}
