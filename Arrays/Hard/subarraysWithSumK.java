package ArrayPracticeHard;

import java.util.HashMap;
import java.util.Map;

public class subarraysWithSumK {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 2};
        int b= 2;
      int ans=  findSubarraysWithSumK(arr, b);
      System.out.println(ans);
    }

     public static int findSubarraysWithSumK(int []a, int b) {
        //BetterApproach
    //    int n= a.length;
    //    int count=0;
       
    //    for(int i=0;i<n;i++){
    //        int XOR=0;
    //        for(int j=i;j<n;j++){
    //            XOR=XOR^a[j];
    //            if(XOR==b){
    //                count++;
    //            }
    //        }
    //    }
    //    return count;
    //Bruteforce Approach
    int n= a.length;
    int count=0;
    Map<Integer,Integer> map=new HashMap<>();
    int XOR=0;
    map.put(XOR,map.getOrDefault(XOR, 0)+1);
    for(int i=0;i<n;i++){
        XOR=XOR^a[i];
        int x= XOR^b;
        if(map.containsKey(x)){
            count= count + map.get(x);
        }
        map.put(XOR,map.getOrDefault(XOR, 0)+1);
    }
    return count;
    }
}
