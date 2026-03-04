import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { -1,-2,-3,-4,-5};
        int[] ans = twoSum(nums, -8);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        // int n = nums.length;
        // int[] arr = new int[2];
        // for (int i = 0; i < n; i++) {
        //     int ans = 0;
        //     for (int j = i + 1; j < n; j++) {
        //         ans = nums[i] + nums[j];
        //         if (ans == target) {
        //             arr[0] = i;
        //             arr[1] = j;
        //         }
        //     }
        // }
        // return arr;
       int n=nums.length;
       int[] ans= new int[2];
       ans[0]=ans[1]=-1;
       Map<Integer,Integer> map= new HashMap<>();
       for(int i=0;i<n;i++){
        int rem=target-nums[i];
        if(map.containsKey(rem)){
            ans[0]= map.get(rem);
            ans[1]=i;
        }
        map.put(nums[i], i);
       }
       return ans;

    }

}
