package ArrayPracticeEasy;

import java.util.Arrays;

public class RightRotatebyKplaces {
public static void main(String[] args) {
     int[] arr= {1,2,3,4,5,6,7};
      int k=2;
      rotate(arr, k);
      System.out.println(Arrays.toString(arr));
}

public static void rotate(int[] arr,int k){

    int n= arr.length;
    //Bruteforce Method
//     int[] temp = new int[n];
//     int d=k%n;
//     for (int i = 0; i < d; i++) {
//         temp[i] = arr[n - d + i];
//     }
//      System.out.println(Arrays.toString(temp));
//      for(int i=d;i<n;i++){
//       temp[i]=arr[i-d];
//     }
//     for(int i=0;i<n;i++){
//     arr[i]=temp[i];
//  }

//Optimal Method
  // Reverse first n-k elements
    reverse(arr, 0, n - k - 1);
    // Reverse last k elements
    reverse(arr, n - k, n - 1);
    // Reverse whole array
    reverse(arr, 0, n - 1);
}

public static void reverse(int[] arr,int start,int end){
    while (start <= end) {
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
 }
}
}
