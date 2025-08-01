package Sorting;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
         int[] arr= {2,1,9,34,18,13};
          int n= arr.length;
          sort(arr,0,n-1);
          System.out.println(Arrays.toString(arr));;
    }


    public static void sort(int[] arr,int low,int high){
        if(low<high){
            int partitionIndex= Partition(arr,low,high);
            sort(arr, low, partitionIndex-1);
            sort(arr, partitionIndex+1, high);
        }
    }

    public static int Partition(int[] arr,int low,int high){
        int i=low;
        int j=high;
        int pivot= arr[low];
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
             while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
         int temp= arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }

}
