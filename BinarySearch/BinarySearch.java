package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        // int ans=search(nums, target);
        int n=nums.length;
        int ans =search(nums, 0, n-1, target);
        System.out.println(ans);
    }
    //Iterative
    // public static int search(int[] nums, int target) {
    //     int n=nums.length;
    //    int low= 0;
    //    int high=n-1;
    //    while(low<=high){
    //     int mid= (low+high)/2;
    //     if(nums[mid]==target){
    //         return mid;
    //     }
    //     else if (nums[mid]<target){
    //         low=mid+1;
    //     }
    //     else{
    //         high=mid-1;
    //     }
        
    //    }
    //    return -1;
    // }
    //Recursive
    public static int search(int[] nums, int low, int high,int target) {
        int n=nums.length;
    
            if(low>high) return -1;
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                return search(nums, mid+1, high, target);
            }

            return search(nums, low, mid-1, target);
        

    }

}
