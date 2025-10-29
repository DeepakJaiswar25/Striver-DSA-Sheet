package BinarySearch;

public class MinCapacityToShip {
    public static void main(String[] args) {
        int weights[] ={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        int ans =findMinCapacity(weights, days);
        System.out.println(ans);
    }

    public static int findMinCapacity(int[] weights, int days){
        int low=Integer.MIN_VALUE;
        int high=0;
        int n= weights.length;
        for(int i=0;i<n;i++){
            low= Math.max(low,weights[i]);
            high= high+weights[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int reqdDays =findReqdDays(weights, mid);
            if(reqdDays<=days){
                high=mid-1;
                
            }
            else{
                low= mid+1;
            }
        }

        return low;
    }


    public static int findReqdDays(int[] weights ,int capacity){
      int days=1;
      int load =0;
      int n= weights.length;
      for(int i=0;i<n;i++){
        if(load + weights[i]<= capacity){
            load +=load +weights[i];
        }
        else{
            days= days+1;
            load=weights[i];
        }
      }
      return days;
    }

}
