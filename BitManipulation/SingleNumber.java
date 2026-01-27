package BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,4};
        int ans= findSingleNumber(nums);
        System.out.println(ans);
    }

    public static int findSingleNumber(int[] nums){
        int n=nums.length;
        int XOR=0;
        for(int i=0;i<n;i++){
            XOR= XOR ^ nums[i];
        }
        return XOR;
    }
}
