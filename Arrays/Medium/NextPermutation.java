package ArrayPracticeMedium;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,n-1);
        }
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
            }
        }

        reverse(nums,ind+1,n-1);
               
    }

    public static void reverse(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        swap(nums, l, r);
        reverse(nums, l + 1, r - 1);
    }

    public static void swap(int[] nums, int i, int ind) {
        int temp = nums[i];
        nums[i] = nums[ind];
        nums[ind] = temp;
    }
}
