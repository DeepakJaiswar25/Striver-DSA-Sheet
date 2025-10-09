package BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/1789805371/
//Search in roatated array with duplicate elements.
public class SearchInRotatedArray2 {
    public static void main(String[] args) {
          int[] nums = {2,5,6,0,0,1,2};
       int target=0;
       boolean ans=search(nums, target);
       System.out.println(ans);
    }
    public static boolean search(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low=low+1;
                high=high-1;
                continue;
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
    return false;
        }
       
    }
