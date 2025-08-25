package ArrayPracticeEasy;

import java.util.Arrays;

public class MoveZerostoEnd {

    public static void main(String[] args) {
        int[] arr={1,2,0,0,3,4,0,0,0,6,0};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void moveZero(int[] arr){
     int n=arr.length;
     int i=0;

  for( i=0;i<n;i++){
    if(arr[i]==0){
      break;
    }
  }
  for(int j=i+1;j<n;j++){
    if(arr[i]<arr[j]){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
    }
  }

    }
}
