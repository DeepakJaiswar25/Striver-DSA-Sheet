package BinarySearch;

public class CountOccurences {
    public static void main(String[] args) {
       int array[] = {1, 1, 2, 2, 2, 2, 2, 3};
       int target=2;
       int ans=  findOccurence(array, target);
       System.out.println(ans);
    }
    public static int findOccurence(int[] nums,int target){
        int first= findFirst(nums, target);
        int last=findLast(nums, target);
        int ans= last-first+1;


        return ans;
    }
    public static int findFirst(int[] nums,int target ){
        int n=nums.length;
        int low=0;
        int high= n-1;
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
     public static int findLast(int[] nums,int target ){
        int n=nums.length;
        int low=0;
        int high= n-1;
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
            else {
                high=mid-1;
            }
    }
     return ans;
}
}

