package BinarySearch;

public class SplitArray {

    public static void main(String[] args) {
        int[]  nums = {7,2,5,10,8};
        int k=2;
        int ans=findSplitArray(nums, k);
        System.out.println(ans);
    }

    public static int findSplitArray(int[] arr, int k){
     int low=Integer.MIN_VALUE;
     int high=0;
     int n=arr.length;
     for(int i=0;i<n;i++){
        low=Math.max(low,arr[i]);
        high= high+ arr[i];
     }
     while(low<=high){
        int mid=(low+high)/2;
        int split= findSplit(arr,mid);
        if(split<=k){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
     }
     return low;
    }

     public static int findSplit(int[] arr, int numbers){
        int split=1;
        int number=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(number+arr[i]<=numbers){
                number+=arr[i];
            }
            else{
                split++;
                number=arr[i];
            }
        }
        return split;
     }
}
