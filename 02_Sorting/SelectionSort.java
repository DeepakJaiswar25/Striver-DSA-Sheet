package Sorting;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr= {2,1,9,34,18,13};
        sort(arr);
        System.out.println(Arrays.toString(arr));;

    }

    public static void sort(int[] arr){
     for(int i=0;i<=arr.length-2;i++){
        int min= i;
        for(int j=i;j<=arr.length-1;j++){
            if(arr[j]<arr[min]){
                min=j;
            }    
        }
        int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        
     }
    }

}
