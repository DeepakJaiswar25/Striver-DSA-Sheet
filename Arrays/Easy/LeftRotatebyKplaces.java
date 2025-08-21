package ArrayPracticeEasy;

import java.util.Arrays;

public class LeftRotatebyKplaces {
public static void main(String[] args) {
      int[] arr= {1,2,3,4,5,6,7};
      int k=3;
      rotate(arr, k);
      System.out.println(Arrays.toString(arr));
}

 public static void rotate(int[] arr,int k){
//Bruteforce Approach
 int n= arr.length;
//  int[] temp = new int[n];
// int d=k%n;
//  for(int i=d;i<n;i++){
//     temp[i-d]=arr[i];
//  }
//  for(int i=n-d;i<n;i++){
//     temp[i]=arr[i-(n-d)];
//  }
//  for(int i=0;i<n;i++){
//     arr[i]=temp[i];
//  }
 // Reverse first k elements
reverse(arr,0,k-1);
// Reverse last n-k elements
reverse(arr, k,n-1);
// Reverse whole array
reverse(arr,0,n-1);



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
