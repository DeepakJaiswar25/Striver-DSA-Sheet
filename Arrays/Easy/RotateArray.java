package ArrayPracticeEasy;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        rotate(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr,int k){
       int temp= arr[0];
       for(int i=0;i<k-1;i++){
        arr[i]=arr[i+1];
       }
       arr[k-1]=temp;
    }
}
