package Sorting;

import java.util.Arrays;

public class RecInsertion {
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        int n=arr.length;
        sort(arr,0, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr,int i,int n){
        if(n==i){
            return;
        }
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
             int temp= arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
        }
        sort(arr, i+1, n);
    }

}
