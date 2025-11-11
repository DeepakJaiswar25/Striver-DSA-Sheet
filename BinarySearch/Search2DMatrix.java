package BinarySearch;

public class Search2DMatrix {
public static void main(String[] args) {
    int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target = 13;
    boolean ans=searchMatrix(matrix,target);
    System.out.println(ans);
}

 public static boolean searchMatrix(int[][] matrix, int target) {
    //Bruteforce Approach
    // int n= matrix.length;
    // int m= matrix[0].length;

    // for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         if(matrix[i][j]==target){
    //             return true;
    //         }
    //     }
    // }
    // return false;
    //Better Approach
    // int n= matrix.length;
    // int m= matrix[0].length;
    //  boolean ans=false;
    // for(int i=0;i<n;i++){
    //   if(matrix[i][0]<= target && target<= matrix[i][m-1]){
    //   ans=binarysearch(matrix[i], target);
    //   }  
    // }
    // return ans;
    //Optimal Approach
    int n= matrix.length;
    int m= matrix[0].length;
    int low=0;
    int high= n*m-1;
    while(low<=high){
        int mid=(low+high)/2;
        int row=mid/m; int col =mid%m;
        if(matrix[row][col]==target){
            return true;
        }
        else if(matrix[row][col]<target){
        low=mid+1;
        }
        else{
            high= mid-1;
        }
    }
    return false;
 }

  public static boolean binarysearch(int[] arr, int target){
    int low=0;
    int high= arr.length-1;;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]== target){
         return true;
        }
        else if(arr[mid]<target){
        low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return false;
  }

}
