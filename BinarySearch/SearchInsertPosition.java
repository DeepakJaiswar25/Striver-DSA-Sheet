package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] arr={1,3,5,6};
        int target=0;
        int ans=searchInsert(arr, target);
        System.out.println(ans);
    }
    public static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low= 0;
        int high= n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    return ans;
    }

}
