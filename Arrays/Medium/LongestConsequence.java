package ArrayPracticeMedium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsequence {
    public static void main(String[] args) {
       int[]  nums = {100,4,101,102,1,3,2};
       int count=findLongestConsequence(nums);
       System.out.println(count);

    }

    public static int findLongestConsequence(int[] nums){
        //Bruteforec Approach
    // int n=nums.length;
    // int longest=1;
    // for(int i=0;i<n;i++){
    //  int x=nums[i];
    //  int count=1;
    //  while(LS(nums,x+1)==true){
    //     x +=1;
    //     count+=1;
    //  }
    //  longest= Math.max(longest, count);
    // }

    //     return longest;
    //Better Approach

//     int n=nums.length;
//     if (n == 0) return 0;
//    Arrays.sort(nums);
//    int longest=0;int count=0; int lastsmallest=Integer.MIN_VALUE;
//    for(int i=0;i<n;i++){
//   if(nums[i]-1==lastsmallest){
//     count+=1;
//     lastsmallest= nums[i];
//   }
//   else if(nums[i]!=lastsmallest){
//     count=1;
//     lastsmallest=nums[i];
//   }
//   longest= Math.max(longest,count);
//    }
    
//     return longest;
    //Optimal Approach
    int n= nums.length;
    Set<Integer> set= new HashSet<>();
    if (n == 0)
            return 0;

    int longest = 0;
    for(int i=0;i<n;i++){
        set.add(nums[i]);
    }
    for(int it:set){

        if(!set.contains(it-1)){
           int x=it;
           int count =1;
           while(set.contains(x+1)){
            x+=1;
            count+=1;
           }
        longest=Math.max(count, longest);
        }
    }
    return longest;
    }

    // public static boolean LS(int[] nums,int x){
    //     int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         if(nums[i]==x){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

}
