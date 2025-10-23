package BinarySearch;

public class MinDaysForBouquets {
    public static void main(String[] args) {
       int[] bloomDay = {1,10,3,10,2};
       int m = 3; int k = 1;
      int ans= minDays(bloomDay, m, k);
      System.out.println(ans);
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int[] ans= findMinAndMax(bloomDay);
        int day=0;
        int low=ans[0];
        int high= ans[1];
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                day=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return day;
    
        
    }
    public static boolean possible(int[] bloomday,int day, int m, int k){
        int n= bloomday.length;
        int nob=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(bloomday[i]<=day){
                count++;
            }
            else{
                nob += (count)/k;
                count=0;
            }
        }
         nob += (count)/k;
        if(nob>= m) return true;
        return false;
    }

    public static int[] findMinAndMax(int[] bloomday){
        int n= bloomday.length;
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
         mini = Math.min(mini,bloomday[i]);
         maxi =Math.max(maxi,bloomday[i]);
        }
        return new int[]{mini, maxi};
    }

}
