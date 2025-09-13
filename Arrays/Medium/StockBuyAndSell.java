package ArrayPracticeMedium;

public class StockBuyAndSell {

    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int profit = findProfit(arr);
        System.out.println(profit);
    }

    public static int findProfit(int[] arr){
        int n=arr.length;
        int profit=0;
        int mini=arr[0];
        for(int i=1;i<n;i++){
            int cost=arr[i]- mini;
            profit=Math.max(cost,profit);
            mini=Math.min(arr[i], mini);
        }
        return profit;
    }
}
