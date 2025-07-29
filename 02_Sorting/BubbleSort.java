package Sorting;

import java.util.Arrays;

public class Bubblesort{

    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        int n=arr.length;
        sort(arr, n);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr,int n){
        for(int i=0;i<n;i++){
            boolean swapped = false;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                 int temp = arr[j];
                 arr[j]= arr[j-1];
                 arr[j-1]=temp;
                 swapped=true;
                }
            }
            if(!swapped){
                break;
            }
            System.out.println("runs");
        }   
    }
}
