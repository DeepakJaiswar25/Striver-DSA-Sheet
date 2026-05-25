public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {2,-3,4,-2,2,1,-1,4};
        int ans= maxSubArray(nums);
        System.out.println(ans);
    }

    public static int maxSubArray(int[] nums) {
        int max=nums[0];
        int maxSum=nums[0];
        int n= nums.length;
        for(int i=1;i<n;i++){
            max= Math.max(nums[i]+max,nums[i]);
            maxSum=Math.max(max,maxSum);
        }
        return maxSum;
    }
}
