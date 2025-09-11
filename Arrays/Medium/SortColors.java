package ArrayPracticeMedium;

import java.util.Arrays;

public class SortColors {
public static void main(String[] args) {
    int[] nums={2,0,2,1,1,0};
   sort(nums);
   System.out.println(Arrays.toString(nums));
}

public static void sort(int[] nums){
    //Better Appproach. 
    // int n= nums.length;
    //  int count0=0;
    // int count1=0;
    // int count2=0;
    // for(int i=0;i<n;i++){
    //     if(nums[i]==0){
    //         count0++;
    //     }
    //     else if(nums[i]==1){
    //         count1++;
    //     }
    //     else{
    //         count2++;
    //     }
    // }
    // System.out.println("0 count "+count0+" 1 count "+count1+" 2 count "+count2);
    // for(int i=0;i<count0;i++){
    //     nums[i]=0;
    // }
    // for(int i=count0;i<count0+count1;i++){
    //     nums[i]=1;
    // }
    // for(int i=count0+count1;i<n;i++){
    //     nums[i]=2;
    // }

    // Optimal Approach Dutch National Flag Algorithm, also known as the three-pointer approach.
    int n= nums.length;
    int low=0; int mid=0;
    int high=n-1;
    while(mid<=high){

        if(nums[mid]==0){
        int temp= nums[low];
        nums[low]= nums[mid];
        nums[mid]= temp;
        mid++;
        low++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
        int temp= nums[high];
        nums[high]= nums[mid];
        nums[mid]= temp;
        high--;
        }
    }
}
}
