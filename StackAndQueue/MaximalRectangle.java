package StackAndQueue;

import java.util.Stack;

public class MaximalRectangle {

    public static void main(String[] args) {
       char[][]  matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
       int ans= maximalRectangle(matrix);
       System.out.println(ans);
    }

    public static int maximalRectangle(char[][] matrix) {

        int n=matrix.length;
        int m=matrix[0].length;
        int[][] pre= new int[n][m];
        int max=0;
        for(int j=0;j<m;j++){

            int sum=0;
            for(int i=0;i<n;i++){
                if(matrix[i][j]=='1'){
                    int val=Character.getNumericValue(matrix[i][j]);
                    sum= sum + val;
                    pre[i][j]=sum;
                }
                else {
                    sum=0;
                    pre[i][j]=sum;
                }

            }
        }

        for(int i=0;i<n;i++){
         max= Math.max(max, largestRectangle(pre[i]));     
        }

        return max;
    }


    public static int largestRectangle(int[] arr){

        int n= arr.length;
        int max=0;
        int nse=0;
        int pse=0;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int element=st.pop();
                nse=i;
                pse= st.isEmpty() ? -1 : st.peek();
                max= Math.max(max,arr[element]*(nse-pse-1)); 
            }
            st.push(i);
        }
        while(!st.isEmpty()){
             int element=st.pop();
                nse=n;
                pse= st.isEmpty() ? -1 : st.peek();
                max= Math.max(max,arr[element]*(nse-pse-1)); 
        }
        return max;
    }
}
