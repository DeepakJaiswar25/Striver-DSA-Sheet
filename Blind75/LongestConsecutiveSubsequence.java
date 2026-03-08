import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
       int[] nums = {0};
       int ans=longestConsecutive(nums);
       System.out.println(ans);
        
    }

     public static int longestConsecutive(int[] nums) {
        
        // int n= nums.length;
        // if(n==0) return 0;
        // Arrays.sort(nums);
        // int count=1; 
        // int maxCount=1;
        // for(int i=0;i<n-1;i++){
        //     int val= nums[i]+1;
        //     if(nums[i+1]==nums[i]) continue;
        //     if(nums[i+1]==val){
        //         count++;
        //     } 
        //     else{
        //     maxCount=Math.max(count,maxCount);
        //     count=1;  
        //     }  
        //     maxCount=Math.max(count,maxCount);    
        // }
        // return maxCount;
        int n=nums.length;
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int longest=0;
        for(int num: set){

            if(!set.contains(num-1)){
                int currentNum=num;
                int count=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                longest= Math.max(count, longest);
            }
        }
        return longest;
    }
    
}
