import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
     int[] nums = {1, 2, 3, 3};
     boolean ans= hasDuplicate(nums);
     System.out.println(ans);
    }

     public static boolean hasDuplicate(int[] nums) {

        // Map<Integer,Integer> mp= new HashMap<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     mp.put(nums[i],mp.getOrDefault(nums[i], 0)+1);
        // }
        // for(Map.Entry<Integer,Integer> map: mp.entrySet()){
        //     if(map.getValue()>1){
        //         return true;
        //     }
        // }
        // return false;


         int n= nums.length;
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
     }
}
