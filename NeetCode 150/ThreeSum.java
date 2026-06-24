import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
       int[] nums = {-1,0,1,2,-1,-4};
       List<List<Integer>> ans= threeSum(nums);
       System.out.println(ans);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> ans= new HashSet<>();
      for(int i=0;i<n-2;i++){
      int l=i+1;
      int r=n-1;
        while(l<r){
            if(nums[l]+nums[r]+nums[i]==0){
                ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                l++;
                r--;
            }
            if(nums[l]+nums[r]+nums[i]<0){
                l++;
            }
            else{
                r--;
            }
        }
    }
        return new ArrayList<>(ans);
    }
}
