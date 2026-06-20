import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
       int target = 9;
       int[] ans= twoSum(nums, target);
       System.out.println(Arrays.toString(ans));
       
    }

     public static int[] twoSum(int[] nums, int target) {

        int n= nums.length;
        Map<Integer,Integer> mp= new HashMap<>();
        int[] ans= new int[2];
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(mp.containsKey(rem)){
                ans[0]= mp.get(rem);
                ans[1]=i;
            }
            mp.put(nums[i], i);
        }
        return ans;
     }
}
