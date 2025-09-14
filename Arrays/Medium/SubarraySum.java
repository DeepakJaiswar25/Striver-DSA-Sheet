package ArrayPracticeMedium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static void main(String[] args) {
        int[] nums={1,1,1};
        int k=2;
        int count =findSubArraySum(nums,k);
        System.out.println(count);
    }
    
    public static int findSubArraySum(int[] arr, int k){

        int sum=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0, 1);
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            int rem= sum-k;
            count+=map.getOrDefault(rem, 0);
            map.put(sum,map.getOrDefault(sum, 0)+1);
       }
       return count;

    }
}
