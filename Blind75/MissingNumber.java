public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,2};
        int ans=missingNumber(nums);
        System.out.println(ans);
    }

     public static int missingNumber(int[] nums) {
        // int n=nums.length;
        // int totalSum= (n*(n+1))/2;
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum=sum+ nums[i];
        // }
        // return totalSum-sum;
        int n=nums.length;
        int allXOR=0;
        for(int i=0;i<n;i++){
            allXOR= allXOR^nums[i];
        }
        for(int i=0;i<=n;i++){
            allXOR =allXOR^ i;
        }
        return allXOR;
     }
}
