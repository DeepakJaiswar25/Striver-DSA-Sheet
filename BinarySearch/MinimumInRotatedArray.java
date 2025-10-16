package BinarySearch;

public class MinimumInRotatedArray {
public static void main(String[] args) {
    int[] nums={ 3,4,5,1,2};
    int ans =findMin(nums);
    System.out.println(ans);
}
public static int findMin(int[] nums){
    int n= nums.length;
       int low=0;
       int high =n-1;
       int ans = Integer.MAX_VALUE;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[low]<=nums[high]){
             ans= Math.min(ans, nums[low]);
            break;
        }
        if(nums[low]<=nums[mid]){
            ans= Math.min(ans, nums[low]);
            low=mid+1;
        }
        else{
            ans= Math.min(ans,nums[mid]);
            high=mid-1;
        }
       } 
       return ans;
}
}
