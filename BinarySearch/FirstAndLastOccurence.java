package BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] nums= {1,2,3};
        int target=1;
       int ans[]= findFirstAndLast(nums, target);
       System.out.println(Arrays.toString(ans));      
   }

    public static int findFirst(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
            ans=mid;
            high=mid-1;
            }
             else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                 high=mid-1;
            }
        }
        return ans;
    }
     public static int findLast(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
            ans=mid;
            low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
             high=mid-1; 
            }
        }
        return ans;
    }
    public static int[] findFirstAndLast(int[] nums,int target){
         int first= findFirst(nums, target);
       if(first ==-1) return new int[] {-1,-1};
        int last= findLast(nums, target);

       return new int[] {first,last};
    }
}
