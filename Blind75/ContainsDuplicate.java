import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums= {1, 2, 3, 3};
        boolean ans=hasDuplicate(nums);
        System.out.println(ans);
    }

    public static  boolean hasDuplicate(int[] nums) {

        //BruteForce
        // int n= nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //Better
    //     int n= nums.length;
    //     Map<Integer,Integer> map= new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    //     }
    //    for(Map.Entry<Integer,Integer> val: map.entrySet()){
    //     if(val.getValue()>1){
    //         return true;
    //     }
    //    }
    //    return false;

    //Optimal
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
