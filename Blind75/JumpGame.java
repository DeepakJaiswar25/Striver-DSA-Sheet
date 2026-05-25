public class JumpGame {
    public static void main(String[] args) {
      int[] nums = {1,2,0,1,0};
      boolean ans= canJump(nums);
      System.out.println(ans);
    }

     public static boolean canJump(int[] nums) {
        int n=nums.length;
        int last= n-1;
        for(int i=n-2;i>=0;i--){
            if(i+ nums[i]>=last){
                last=i;
            }
        }
        return last==0;
    }
}
