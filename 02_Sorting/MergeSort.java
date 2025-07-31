package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
          int[] arr= {2,1,9,34,18,13};
          int n= arr.length;
          sort(arr,0,n-1);
          System.out.println(Arrays.toString(arr));;

    }

    public static void sort(int[] arr,int low,int high){
       if(low>=high)
       return;
       int mid= (low+high)/2;
       sort(arr, low, mid);
       sort(arr,mid+1,high);
       merge(arr,low,mid,high);
    }

    public static void merge(int[] arr,int low, int mid,int high){
        int[] temp=new int[high - low + 1];
        int i=0;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){

            if(arr[left]<arr[right]){
                temp[i]=arr[left];
                left++;
                i++;
            }
            else{
                 temp[i]=arr[right];
                right++;
                i++;
            }          
        }
        while(left<=mid){
                temp[i]=arr[left];
                left++;
                i++;
        }
        while(right<=high){
             temp[i]=arr[right];
                right++;
                i++;
        }
        System.out.println("Temp::"+Arrays.toString(temp));
        for(int j=low;j<=high;j++){
            arr[j]=temp[j-low];
        }
    }

}
