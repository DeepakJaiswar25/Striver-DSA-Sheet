package ArrayPracticeMedium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
       int  nums[] = {2,2,1,1,1,2,2};
       int ele =findMajorityElement(nums);
       System.out.println(ele);
    }

    public static int findMajorityElement(int[] nums){
        //bruteforce Method
    //    int n= nums.length;
    //    for(int i=0;i<n;i++){
    //     int count=0;
    //     for(int j=0;j<n;j++){
    //         if(nums[i]==nums[j]){
    //             count++;
    //         }
    //     }
    //     if(count>n/2){
    //         return nums[i];
    //     }
    //    }
    //     return -1;

    //Better Approach

    // int n= nums.length;
    // Map<Integer,Integer> map=new HashMap<>();
    // for(int i=0;i<n;i++){
    //     map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    // }
    // for(Map.Entry<Integer,Integer> it: map.entrySet()){
    //     if(it.getValue()>n/2){
    //         return it.getKey();
    //     }
    // }
    // return -1;
    //Optimal Approach
    int count=0;
        int ele=0;
      for(int i=0;i<nums.length;i++){
        if(count==0){
            ele=nums[i];
            count=1;
        }
        else if(nums[i]==ele){
            count++;
        }
        else{
            count--;
        }
      }
       int count1=0;
      for(int i=0;i<nums.length;i++){
        if(ele==nums[i]){
            count1++;
        }
      }
        if(count1>nums.length/2){
            return ele;
        }
      return -1;
    }
}
