public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans= maxProfit(prices);
        System.out.println(ans);   
    }

     public static int maxProfit(int[] arr) {
        //Greedy
        // int n= arr.length;
        // int profit=0;
        // int min= arr[0];
        // for(int i=1;i<n;i++){
        //    int cost= arr[i]-min;
        //     profit= Math.max(profit,cost);
        //     min=Math.min(arr[i],min);
        // }
        // return profit;

        //Sliding Window
        int n= arr.length;
        int l=0;  //buy
        int r=0; //sell
        int maxProfit=0;
        while(r<n){
            if(arr[l]<arr[r]){
                int profit= arr[r]-arr[l];
                maxProfit= Math.max(maxProfit, profit);
            }
            else{
                l=r;
            }
            r++;
        }
        return maxProfit;
    }
}
