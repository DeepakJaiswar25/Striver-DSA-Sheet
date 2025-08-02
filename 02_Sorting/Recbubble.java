package Sorting;

import java.util.Arrays;

public class Recbubble {
public static void main(String[] args) {
     int[] arr={13,46,24,52,20,9};
        int n=arr.length;
        sort(arr, n);
        System.out.println(Arrays.toString(arr));
}

public static void sort(int[] arr,int n){
    if(n==1){
        return;
    }
    int didSwap=0;
     for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = 1;
            }
        }
        if(didSwap==0)
        return;
    sort(arr,n--);
}
}
