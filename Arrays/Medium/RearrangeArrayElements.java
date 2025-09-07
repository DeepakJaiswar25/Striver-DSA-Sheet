package ArrayPracticeMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayElements {
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        int[] reArrangeArrayElements = reArrangeArrayElements(nums);
        System.out.println(Arrays.toString(reArrangeArrayElements));

    }

    public static int[] reArrangeArrayElements(int[] nums){
    //     int n=nums.length;
    //    ArrayList<Integer> pos=new ArrayList<>();
    //    ArrayList<Integer> neg=new ArrayList<>();

    //     for(int i=0; i < n;i++){

    //         if(nums[i]<0){
    //            neg.add(nums[i]);
    //         }
    //         else{
    //             pos.add(nums[i]);
    //         }
    //     }
    //     for(int i=0;i<n/2;i++){
    //        nums[i*2]=pos.get(i);
    //        nums[i*2+1]=neg.get(i);
    //     }
    //     return nums;
    int n=nums.length;
    int[] ans=new int[n];
    int pos=0;int neg=1;
    for(int i=0;i<n;i++){
        if(nums[i]<0){
            ans[neg]= nums[i];
            neg+=2;
        }
        else{
            ans[pos]= nums[i];
            pos+=2;
        }
    }
    return ans;
    }

}
