package ArrayPracticeEasy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr={1,1,2};
        int removeDuplicates = RemoveDup(arr);
        System.out.println(removeDuplicates);
        
    }
    public static int RemoveDup(int[] nums){
         //Bruteforce method
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k = set.size();
        int j=0;
        for(int x: set){
            nums[j++]=x;
        }
        return k;
        //Optimal 
    //      int i=0;
    //     for(int j=1;j<nums.length;j++){
    //        if(nums[j]!=nums[i]){
    //         nums[i+1]=nums[j];
    //         i++;
    //        }
    // }
    //  return i+1;
}
}
