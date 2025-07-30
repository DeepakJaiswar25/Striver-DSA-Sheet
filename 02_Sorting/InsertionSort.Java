package Sorting;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        sort(arr, n);
        System.out.println(Arrays.toString(arr));
    }


    public static void sort(int[] arr,int n){

        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp= arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
           
        }
    }
}
