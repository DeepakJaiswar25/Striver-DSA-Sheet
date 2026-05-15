public class HouseRobber2 {

    public static void main(String[] args) {
       int[] nums = {3,4,3};
       int ans=rob(nums);
       System.out.println(ans);
    }

    public static int rob(int[] nums) {
        int n= nums.length;
        if(n==1) return nums[0];
        int rob1= robber(0,n-2,nums);
        int rob2= robber(1,n-1,nums);
        return Math.max(rob1,rob2);

    }

    public static int robber(int start,int end,int[] nums){
        int n= end-start+1;
        if(n==1) return nums[start];
        if(n==2) return Math.max(nums[start],nums[start+1]);

        int[] dp= new int[n];
        dp[0]= nums[start];
        dp[1]=Math.max(nums[start],nums[start+1]);
        for(int i=2;i<n;i++){
            dp[i]= Math.max((dp[i-2]+nums[start+i]),dp[i-1]);
        }
        return dp[n-1];
    }
    
}
