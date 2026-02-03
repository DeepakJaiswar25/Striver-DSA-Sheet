package StackAndQueue;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public static void main(String[] args) {
      int[]  heights = {2,4};
      int ans= largestRectangleArea(heights);
      System.out.println(ans);
    }

     public static int largestRectangleArea(int[] heights) {
        // int n=heights.length;
        // int max=0;
        // int[] NSE= nse(heights);
        // int[] PSE= pse(heights);
        // for(int i=0;i<n;i++){
        //  max= Math.max(max,(heights[i]* (NSE[i]-PSE[i]-1)));
        // }
        // return max;

        int n=heights.length;
        int max=0;
        Stack<Integer> st= new Stack<>();
        int nse=0;
        int pse=0;
        for(int i=0;i<n;i++){

            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                int element= st.pop();
                nse=i ;
                pse= st.isEmpty() ? -1 :st.peek();
                max= Math.max(max, heights[element]*(nse-pse-1));
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int element= st.pop();
            nse=n;
            pse= st.isEmpty() ? -1 : st.peek();
            max= Math.max(max, heights[element]*(nse-pse-1));
        }
        return max;
    }

    public static int[] nse(int[] arr){
        int n= arr.length;
        int[] ans= new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && arr[st.peek()]>= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i]=n;
            else{
                ans[i]= st.peek();
            }
            st.push(i);
        }
         return ans;
    }

    public static int[] pse(int[] arr){
        int n= arr.length;
        int[] ans= new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]> arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i]=-1;
            else{
                ans[i]= st.peek();
            }
             st.push(i);
        }
         return ans;
    }

}
