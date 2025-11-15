package BinarySearch;

public class MatrixMedian {
    public static void main(String[] args) {
       int[][]  matrix={{1,5,7,9,11}, {2, 3, 4, 8, 9}, {4,11,14,19,20} ,{6,10,22,99,100},{7,15,17,24,28}};
       int ans=findMedian(matrix);
       System.out.println(ans);
    }
    public static int findMedian( int[][] matrix){
        int low= Integer.MAX_VALUE;
        int high= Integer.MIN_VALUE;
        int n= matrix.length;
        int m= matrix[0].length;
        for(int i=0;i<n;i++){
            low=Math.min(low, matrix[i][0]);
            high= Math.max(high, matrix[i][m-1]);
        }
        int reqd=(n*m)/2;
        while(low<=high){
            int mid=(low+high)/2;
            int smallerEquals= countEquals(matrix, mid);
            if(smallerEquals<= reqd){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return low;
    }

    public static int countEquals(int[][] matrix,int k){
         int n= matrix.length;
         int count=0;
         for(int i=0;i<n;i++){
            count += upperBound(matrix[i], k);
         }
         return count;     
    }

    public static int upperBound(int[] mat,int k){
    int n=mat.length;    
    int low=0;
    int high=n-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(mat[mid]>k){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return low;
    }
}
