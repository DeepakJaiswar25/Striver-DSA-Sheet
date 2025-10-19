package BinarySearch;

public class KokoEatingBananas {
    public static void main(String[] args) {
       int[] piles = {3,6,7,11};
       int h=8;
       int ans=minEatingSpeed(piles, h);
       System.out.println(ans);
    }
  public static int findMax(int[] piles){
        int maxi=Integer.MIN_VALUE;
        int n= piles.length;
       for(int i=0;i<n;i++){
       maxi=Math.max(piles[i],maxi);
       }
         return maxi;  
        }
    public static int minEatingSpeed(int[] piles, int h){

        int maxNum= findMax(piles);
        int low=1;
        int high= maxNum;
        int ans=1;
        while(low<= high){
            int mid= (low+high)/2;
           int hours=findSpeed(piles, mid);
           if(hours<=h){
            ans=mid;
            high=mid-1;
           }
           else{
            low=mid+1;
           } 
        }
        return ans;
    }
    public static int findSpeed(int[] piles, int mid){
        int n= piles.length;
        int totalHours= 0;
        for(int i=0;i<n;i++){
            totalHours += Math.ceil((double)piles[i]/(double)mid);
        }
        return totalHours;
    }

}
