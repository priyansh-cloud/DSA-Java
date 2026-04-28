public class Day22_buy_sell_stocks {
    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};
        int lowest = prices[0];
        int profit = 0;
        
        
        for(int i = 1; i<prices.length; i++){
            int cost = prices[i] - lowest;
            profit = Math.max( profit, cost );
            lowest = Math.min( lowest, prices[i]);
        }
        System.out.println(profit);


    }
}
