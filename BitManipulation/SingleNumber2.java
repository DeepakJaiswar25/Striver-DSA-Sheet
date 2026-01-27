package BitManipulation;

import java.util.Arrays;


public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums={0,1,0,1,0,1,99};
        int ans=findSingleNumber(nums);
        System.out.println(ans);
    }

    public static int findSingleNumber(int[] nums){
    //     Map<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    //     }
    //     for(Map.Entry<Integer,Integer> val:map.entrySet()){
    //         if(val.getValue()==1){
    //             return val.getKey();
    //         }
    //     }
    //    return -1; 

    Arrays.sort(nums);
    int n= nums.length;
    for(int i=1;i<n;i=i+3){
        if(nums[i]!=nums[i-1]){
            return nums[i];
        }
    }
    return nums[n-1];
    }

}
