public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        int[] nums = {9,1,4,2,3,3,7};
        int ans= lengthOfLIS(nums);
        System.out.println(ans);
    }

    public static int lengthOfLIS(int[] nums) {

        int n= nums.length;

        int[] dp=new int[n];
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                    }
                }
            }
        }
        int maxIndex=0;
      for(int i=0;i<n;i++){
       if(dp[maxIndex]< dp[i]){
        maxIndex=i;
       }
      } 
      
      return dp[maxIndex]+1;
    }
    
}
