public class Day21_min_subarray {
    public static void main(String[] args) {
        
        int arr[] = { -2, 1, -2, 3, 4};
        int best = 0;
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            
            int v1 = best + arr[i] ;
            int v2 =  arr[i];
            best = Math.min(v1,v2);
            ans = Math.min(ans, best);
            
        }
        System.out.println(ans);
    }
}
