package ArrayPracticeMedium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,6,5,7,11};
        int target=14;
        // int[] result=findTwosum(arr,target);
        boolean result=findTwosum(arr,target);
        // System.out.println(Arrays.toString(result));
        System.out.println(result);
    }
    // public static int[] findTwosum(int[] arr,int target){

    //     //Bruteforce Approach:
    //     // int n=arr.length;
    //     // int[] ans= new int[2];
    //     // ans[0]=ans[1]=-1;
    //     // for(int i=0;i<n;i++){

    //     //     for(int j=i+1;j<n;j++){
    //     //         if(arr[i]+arr[j]==target){
    //     //             ans[0]=i;
    //     //             ans[1]=j;
    //     //         }

    //     //     }
    //     // }
    //     // return ans;

    //     //Better Approach:
    //     int n= arr.length;
    //     Map<Integer,Integer> map =new HashMap<>();
    //     int[] ans=new int[2];
    //     ans[0]=ans[1]=-1;
    //     for(int i=0;i<n;i++){
    //         int rem=target-arr[i];
    //         if(map.containsKey(rem)){
    //          ans[0]=map.get(rem);
    //          ans[1]=i;
    //          return ans;
    //         }
    //         map.put(arr[i], i);
            
    //     }
    //     return ans;
    // }

        //Two Pointer Approach when asked boolean Value
         public static boolean findTwosum(int[] arr,int target){
        int n= arr.length;
         int left=0;
         int right=n-1;
         int sum=0;
         Arrays.sort(arr);
         while(left<right){
            sum= arr[left]+arr[right];
            if(sum== target){
                return true;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
         }

        return false;
    }
}
