

public class Day48_koko_eating_banana {
    
    public static void main(String[] args) {
        
        int[] piles = {30,11,23,4,20};
        int h = 5;

        int low = 1;
        int ans = Integer.MAX_VALUE;

        // find max pile
        int high = piles[0];

        for(int i = 1; i < piles.length; i++){
            high = Math.max(high, piles[i]);
        }

        while( low <= high ){
            int mid = ( low + high )/2;

            long totalH = 0;

            for( int i = 0;  i < piles.length; i++ ){
                totalH += (piles[i] + mid - 1) / mid;
            }
            
            if( totalH <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(ans);;
    }
}
