package BinarySearch;

public class CeilBinarySearch {
public static void main(String[] args) {
     int[] arr= {1, 2, 5, 7, 12, 14};
        int target=10;
        int ans=findCeil(arr,target);
        System.out.println(ans);
}
  public static int findCeil(int[] nums,int target){
int n= nums.length;
int low=0;
int high=n-1;
int ans=-1;
while(low<=high){
    int mid= (low+high)/2;
    if(nums[mid]>=target){
        ans=mid;
        high=mid-1;
    }
    else{
       low=mid+1;
    }
}
if(ans==-1){
    return -1;
}
  return nums[ans];
}
}
