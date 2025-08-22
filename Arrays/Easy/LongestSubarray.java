package ArrayPracticeEasy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        int k=3;
       int n=findLongestSubArray(arr,k);
       System.out.println(n);
    }
    public static int findLongestSubArray(int[] arr,int k){
// Bruteforce Method
    //    int n=arr.length;
    //    int len=0;
    //    int maxlen=0;
    //    for(int i=0;i<n;i++){
    //     int sum=0;
    //     for(int j=i;j<n;j++){
    //      sum+= arr[j];
    //      if(sum==k){
    //       len= j-i+1;
    //       maxlen= Math.max(maxlen,len);
    //      }
    //     }
    //    }
    //    return maxlen;

       // Hashing Method
    //    int n= arr.length;  //{1,2,3,1,1,1,1,4,2,3}
    //    Map<Long,Integer> map= new HashMap<>();
    //    long sum=0;
    //    int maxlen=0;
    //    for(int i=0;i<n;i++){
    //calculate the prefix sum till index i:
    //     sum+=arr[i];
    // if the sum = k, update the maxLen:
    //     if(sum==k){
    //         maxlen=Math.max(maxlen,i+1);
    //     }
     // calculate the sum of remaining part i.e. x-k:
    //     long rem= sum-k;
    //Calculate the length and update maxLen:
    //     if(map.containsKey(rem)){
    //         int len=i- map.get(rem);
    //         maxlen = Math.max(maxlen, len);

    //     }
     //Finally, update the map checking the conditions:
    //     if(!map.containsKey(sum)){
    //         map.put(sum, i);
    //     }

    //    }
    //    return maxlen;

    // Two pointer Method Optimal but there is negatives this wont work

    int n=arr.length;
    int left=0;
    int right=0;
    long sum=arr[0];
    int maxlen=0;
    while(right<n){
         // if sum > k, reduce the subarray from left
        // until sum becomes less or equal to k:
        while(left<=right && sum>k){
            sum -=arr[left];
            left++;
        }
        // if sum = k, update the maxLen i.e. answer:
        if(sum==k){
            maxlen=Math.max(maxlen, right-left+1);
        }
        // Move forward thw right pointer:
        right++;
        if(right<n){
            sum += arr[right];
        }

    }
    return maxlen;
    }
}
