public class Day21_max_product_subarray {
    public static void main(String[] args) {
        
        int arr[] = {-2,3,-4};

        int bestEnd = arr[0];
        int minEnd = arr[0];
        int ans = arr[0];

        for(int i = 1; i<arr.length; i++){ // if i = 0, we are multiplying nums[0] with itself again
            int v1 = bestEnd * arr[i];
            int v2 = arr[i];
            int v3 = minEnd * arr[i];

            bestEnd = Math.max(v1, Math.max(v2,v3));
            minEnd = Math.min(v1, Math.min(v2,v3));

            ans = Math.max(ans, bestEnd );

        }
        System.out.println(ans);
    }
}
