package ArrayPracticeHard;

import java.util.ArrayList;
import java.util.List;

public class CountInversions {
    public static void main(String[] args) {
        int[] arr= {5,3,2,1,4};
        int ans= findCountInversions(arr);
        System.out.println(ans);
    }

    public  static int  mergesort(int[] arr,int low,int high){
        int count=0;
        if(low>=high) return count;
        int mid =(low+high)/2;
        count +=  mergesort(arr, low,mid);
        count += mergesort(arr, mid+1, high);
        count +=  merge(arr, low,mid,high);
        return count;
   
    }
    public static int merge(int[] arr,int low,int mid, int high){
        int count =0;
        int left=low;
        int right= mid+1;
        List<Integer> temp= new ArrayList<>();
        while(left<=mid &&  right <= high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                count += (mid-left+1);
                right++;
            }
        }
        while(left<=mid){
             temp.add(arr[left]);
                left++;
        }
        while(right <= high){
            temp.add(arr[right]);
                right++;
        }
        for(int i=0;i<temp.size();i++){
            arr[low+i]=temp.get(i);
        }
        return count;
        
    }

    public static int findCountInversions(int[] arr){
        //Bruteforce Method
    //  int n=arr.length;
    //  int count=0;
    //  for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         if(arr[i]>arr[j]){
    //             count++;
    //         }

    //     }
    //  }
    //     return count;
     int n=arr.length;
     return mergesort(arr, 0, n-1);
    }

}
