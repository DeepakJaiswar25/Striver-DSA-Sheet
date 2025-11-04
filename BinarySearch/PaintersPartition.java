package BinarySearch;


public class PaintersPartition {
    public static void main(String[] args) {
       int boards[] = {10, 20, 30, 40};
       int k=2;
       int ans= findPaintersPartition(boards,k);
       System.out.println(ans);
    }

    public static int findPaintersPartition(int[] arr,int k){
         int low= Integer.MIN_VALUE;
        int high=0;
        int n= arr.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            low= Math.max(low,arr[i]);
            high= high+ arr[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int partition= findNumberofPartition(arr, mid);
            if(partition<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
    public static int findNumberofPartition(int[] arr,int days){
        int partition=1;
        int day=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(day+arr[i]<=days){
                day+=arr[i];
            }
            else{
                partition++;
                day=arr[i];
            }
        }
        return partition;
    }
}
