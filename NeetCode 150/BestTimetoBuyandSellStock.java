public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
       int[] prices = {10,1,5,6,7,1};
       int ans=maxProfit(prices);
       System.out.println(ans);
    }

    public static int maxProfit(int[] prices) {
        //Bruteforce
        // int n=prices.length;
        // int profit= Integer.MIN_VALUE;
        // int maxProfit= 0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         profit= Math.max(profit,prices[j]-prices[i]);
        //     }
        //     maxProfit= Math.max(maxProfit, profit);
        // }
        // return maxProfit;
        //Optimal
        int n=prices.length;
        int profit=0;
        int buy_price= prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }
            else{
                int curr_profit= prices[i]-buy_price;
                profit=Math.max(curr_profit, profit);
            }
        }
        return profit;
    }
}
