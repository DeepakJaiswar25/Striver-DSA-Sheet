package ArrayPracticeHard;

public class MaxProduct {
    public static void main(String[] args) {
      int[] nums={2,3,-2,4};
      int ans= findMaxProduct(nums);  
      System.out.println(ans);
    }

    public static int findMaxProduct(int[] nums){
        //Bruteforce
        // int n= nums.length;
        // int maxi= Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int product =1;
        //     for(int j=i;j<n;j++){
        //         product=product* nums[j];
        //         maxi= Math.max(product, maxi);
        //     }
      
        // }
        // return maxi;
        //Optimal
        int n= nums.length;
        int prefix =1;
        int suffix= 1;
        int maxi= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        if(prefix==0) {
            prefix=1;
        }
         if(suffix==0) {
            suffix=1;
        }
        prefix= prefix* nums[i];
        suffix = suffix*nums[n-i-1];
        maxi= Math.max(maxi,Math.max(prefix,suffix));
        }
        return maxi;
    }

}
