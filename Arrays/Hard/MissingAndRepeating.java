package ArrayPracticeHard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingAndRepeating {
public static void main(String[] args) {
     int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
    int[] ans = findMissingAndRepeating(a);
    System.out.println(Arrays.toString(ans));
}

public static int[] findMissingAndRepeating(int[] nums){
//     int n= nums.length;
//     int missing=-1;
//     int repeating=-1;
//     for(int i=1;i<=n;i++){
//      int count=0;
//     for (int j = 0; j < n; j++) {
//          if (nums[j] == i) count++;
//             }
//     if (count==0){
//     missing=i;
//     }
//     if(count==2){
//     repeating=i;
//     }
//     }
    
//    int[] ans={repeating,missing};
//    return ans;
    // int n= nums.length;
    // int[] hash = new int[n+1];
    // for(int i=0;i<n;i++){
    //     hash[nums[i]]++;
    // }
    // int repeating=-1; int missing =-1;
    // for(int i=1;i<=n;i++){
    //     if(hash[i]==2){
    //         repeating=i;
    //     }
    //     if (hash[i]==0){
    //         missing=i;
    //     }
    // }
    //  int[] ans={repeating,missing};
    //  return ans;
    //Maths optimal Approch.
        long n = nums.length; // size of the array
        // Find Sn and S2n:
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate S and S2:
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += nums[i];
            S2 += (long)nums[i] * (long)nums[i];
        }

        //S-Sn = X-Y:
        long val1 = S - SN;

        // S2-S2n = X^2-Y^2:
        long val2 = S2 - S2N;

        //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = {(int)x, (int)y};
        return ans;

    
} 
}
