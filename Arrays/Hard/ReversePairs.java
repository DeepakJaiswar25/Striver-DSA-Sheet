package ArrayPracticeHard;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {
    public static void main(String[] args) {
        int[] arr= {2,4,3,5,1};
       int ans= findReversePairs(arr);
       System.out.println(ans);
    
    }

    public static int mergesort(int[] arr,int low,int high){
        int count =0;
        if(low>=high) return count;
        int mid=(low+high)/2;
        count+=mergesort(arr, low, mid);
        count+=mergesort(arr, mid+1, high);
        count+= countPairs(arr, low, mid, high);
        merge(arr,low,mid,high);
        return count;
    }
    public static int countPairs(int[] arr,int low, int mid,int high){
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]>2*(arr[right])){
                right ++;
            }
            count += (right-(mid+1));
        }
        return count;


    }
    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp= new ArrayList<>();
        int left= low;
        int right= mid+1;
        while(left <= mid && right <= high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
             temp.add(arr[left]);
             left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=0;i<temp.size();i++){
            arr[low+i]=temp.get(i);
        }
    }

    public static int findReversePairs(int[] arr){
        int n= arr.length;
        return mergesort(arr, 0, n-1);
    }

}
