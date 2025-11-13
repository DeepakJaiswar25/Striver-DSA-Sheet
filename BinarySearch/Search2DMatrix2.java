package BinarySearch;

public class Search2DMatrix2 {
    public static void main(String[] args) {
        
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
         int target = 5;
        boolean ans=  searchMatrix(matrix, target);
        System.out.println(ans);
    }
     public static boolean searchMatrix(int[][] matrix, int target) {
        //Better Approach
        // int n=matrix.length;
        // for(int i=0;i<n;i++){
        //     int ans= binarySearch(matrix[i],target);
        //     if(ans!=-1){
        //         return true;
        //     }
            
        // }
        // return false;
        //Optimal Approach
           int n= matrix.length;
        int m= matrix[0].length;
        int row=0; int col= m-1;
        while(row<n && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
        
    }
    public static int binarySearch(int[] mat,int target){
        int n= mat.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mat[mid]==target){
                ans=mid;
            }
            if(mat[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
