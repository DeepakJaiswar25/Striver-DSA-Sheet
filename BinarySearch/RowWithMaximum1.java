package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class RowWithMaximum1 {
    public static void main(String[] args) {
        int n = 3; int m = 3; 
        ArrayList<ArrayList<Integer>> mat=new ArrayList<>(
            Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 1, 1)),
                new ArrayList<>(Arrays.asList(0, 0, 1)),
                new ArrayList<>(Arrays.asList(0, 0, 0))
            )
        );
        int ans= rowMaxOnes(mat,n,m);
        System.out.println(ans);
    }
    public static int rowMaxOnes(ArrayList<ArrayList<Integer>> mat, int n, int m) {
    //     int maxVal=0;
    //     int maxIndex=-1;
    //     for(int i=0;i<n;i++){
    //         int ans=0;
    //         for(int j=0;j<m;j++){
    //            ans+=mat.get(i).get(j);       
    //         }
    //         if(ans>maxVal){
    //                 maxVal=ans;
    //                 maxIndex=i;
    //             }
    //     }
    // return maxIndex;
     int maxVal=0;
        int maxIndex=-1;
        int ans=0;
        for(int i=0;i<n;i++){
        
        ans =   lowerBound(mat.get(i), m); 
        ans=m-ans;
        if(ans>maxVal){
             maxVal=ans;
             maxIndex=i;
        }  
    }
    
    return maxIndex;
    }
    public static int lowerBound(ArrayList<Integer> arr,int n){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)==1){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
