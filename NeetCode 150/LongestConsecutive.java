import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};
        int ans= longestConsecutive(nums);
        System.out.println(ans);
    }

    public static int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // int count=1;
        // for(int i=0;i<n-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         continue;
        //     }
        //     else if(nums[i]+1==nums[i+1]){
        //         count++;
        //     }
        // }
        // return count;

        int n= nums.length;
        int total=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int num:set){
           if(!set.contains(num-1)){
            int currnum=num;
            int curr=1;
            while(set.contains(currnum+1)){
                currnum++;
                curr++;
            }
            total= Math.max(curr,total);
           }  
        }
        return total;
    }
    
}
