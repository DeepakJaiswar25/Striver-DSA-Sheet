package ArrayPracticeMedium;

import java.util.Arrays;

public class RotateMatrix90 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans=rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
   public static int[][] rotateMatrix(int[][] matrix) {
        int n=matrix.length;
        int m= matrix[0].length;
        //Transpose of matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                swap(matrix,i,j);
            }
        }
        for(int i=0;i<n;i++){
          reverse(matrix[i]);
        }
        return matrix;
    }

     public static void swap(int[][] matrix,int x,int y){
        int temp= matrix[x][y];
        matrix[x][y]= matrix[y][x];
         matrix[y][x]=temp;
     }

    public static void reverse(int[] mat){
        int n= mat.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int temp=mat[left];
            mat[left]=mat[right];
            mat[right]=temp;
        left++;right--;
        }

    }
}
