import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4}; int target = 3;
        int[] ans= twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        int l= 0;
        int r= n-1;
        while(l<=r){
            if(numbers[l]+numbers[r]==target){
                return new int[]{l,r};
            }
            else if(numbers[l]+numbers[r]<target){
                l++;
            }
            else{
                r--;
            }
        }   
        return new int[]{-1,-1};
    }
}
