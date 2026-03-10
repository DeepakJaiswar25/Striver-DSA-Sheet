import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
         List<List<Integer>> ans=threeSum(nums);
         System.out.println(ans);
        
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
         Set<List<Integer>> set= new HashSet<>();
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                if(sum<0){
                left++;
                }
                else{
                right--;
                }

            }
        }
        return new ArrayList<>(set);

    }
    
}
