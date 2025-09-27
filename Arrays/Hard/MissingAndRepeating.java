package ArrayPracticeHard;

import java.util.Arrays;

public class MissingAndRepeating {
public static void main(String[] args) {
     int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
    int[] ans = findMissingAndRepeating(a);
    System.out.println(Arrays.toString(ans));
}

public static int[] findMissingAndRepeating(int[] nums){
    int n= nums.length;
    int missing=-1;
    int repeating=-1;
    for(int i=1;i<=n;i++){
     int count=0;
    for (int j = 0; j < n; j++) {
         if (nums[j] == i) count++;
            }
    if (count==0){
    missing=i;
    }
    if(count==2){
    repeating=i;
    }
    }
    
   int[] ans={repeating,missing};
   return ans;
} 
}
