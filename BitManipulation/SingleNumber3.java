package BitManipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber3 {
    public static void main(String[] args) {
        int[] nums={1,2,1,3,2,5};
        int[] ans= singleNumber(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] singleNumber(int[] nums) {
        // int n= nums.length;
        // int[] ans= new int[2];
        // Map<Integer,Integer> map= new HashMap<>();
        // for(int i=0;i<n;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // int j=0;
        // for(Map.Entry<Integer,Integer> val: map.entrySet()){
        //     if(val.getValue()==1){
        //         ans[j]= val.getKey();
        //         j++;
        //     }
        // }
        // return ans;
        int n= nums.length;
        int XOR= 0;
        int[] ans= new int[2];
        for(int i=0;i<n;i++){
            XOR= XOR ^ nums[i];
        }
        int rightmost= (XOR & (XOR-1)) ^(XOR);
        int b1=0; int b2=0;
        for(int i=0;i<n;i++){
            if((nums[i]& rightmost) ==0 ){
                b1= b1^nums[i];
            }
            else{
                b2= b2^nums[i];
            }
        }
        ans[0]=b1;
        ans[1]=b2;
        return ans;
    }

}
