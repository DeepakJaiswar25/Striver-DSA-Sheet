package BinarySearch;
// Search in rotated array with unique Elements
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedArray1 {

    public static void main(String[] args) {
       int[] nums = {4,5,6,7,0,1,2};
       int target=3;
       int ans=search(nums, target);
       System.out.println(ans);
    }

    public static int search(int[] nums,int target){
   int n= nums.length;
   int low=0;
   int high=n-1;
   while(low<=high){
    int mid=(low+high)/2;
    if(nums[mid]==target){
        return mid;
    }
    if(nums[low]<=nums[mid]){
       if(nums[low]<=target && target <= nums[mid]){
        high=mid-1;
       }
       else{
        low=mid+1;
       }

    }
    else{
        if(nums[mid]<=target && target <=nums[high]){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
   }
   return -1;
    }
}
