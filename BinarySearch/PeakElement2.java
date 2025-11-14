package BinarySearch;

import java.util.Arrays;

public class PeakElement2 {
    public static void main(String[] args) {
    //    int[][] mat = {{10,20,15},{21,30,14},{7,16,32}};
        int[][] mat = {{1,4},{3,2}};
       int[] ans= findPeak(mat);
       System.out.println(Arrays.toString(ans));

    }

    public static int[] findPeak(int[][] mat){
    int n= mat.length;
    int m= mat[0].length;
    int low=0;
    int high= m-1;
    while(low<=high){
        int mid=(low+high)/2;
        int row=MaxElement(mat, mid);
         int left=-1;
         int right=-1;
        if(mid-1>=0) left=mat[row][mid-1];
        if(mid+1<m) right=mat[row][mid+1];
        if(mat[row][mid]>left && mat[row][mid]>right ){
            return new int[]{row,mid};
        }
        if(mat[row][mid]<left){
            high=mid-1;
        }
        else{
            low= mid+1;
        }
    }        
    return new int[]{-1,-1};
    }

    public static int MaxElement(int[][] mat,int col){
        int n= mat.length;
        int max= Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                index=i;
            }
        }
        return index;
    }

}
