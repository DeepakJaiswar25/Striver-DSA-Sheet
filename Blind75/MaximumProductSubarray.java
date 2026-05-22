public class MaximumProductSubarray {
    public static void main(String[] args) {
      int[] nums = {1,2,-3,4};
      int ans= maxProduct(nums);
      System.out.println(ans);
    }

    public static int maxProduct(int[] nums) {
        int n= nums.length;
        int leftproduct= 1;
        int rightproduct=1;

        int ans=nums[0];

        for(int i=0;i<n;i++){
            leftproduct= leftproduct==0 ?1:leftproduct;
            rightproduct= rightproduct==0 ?1:rightproduct;

            leftproduct= nums[i]* leftproduct;
            rightproduct= nums[n-i-1]* rightproduct;

            ans= Math.max(ans,Math.max(leftproduct,rightproduct));
        }
        return ans;
    }
}
