package StackAndQueue;

import java.util.Stack;

public class SumOfSubArraysMaximum {

    public static void main(String[] args) {
      int  arr[] = {1, 3, 2};
      int ans= sumOfMax(arr);
      System.out.println(ans);
    }

    public static int sumOfMax(int[] arr) {
        // code here
       int mod = (int)1e9 + 7;
        int n= arr.length;
        int sum=0;
        int left=0;
        int right=0;
        int[] PLE= ple(arr);
        int[] NLE = nle(arr);

        for(int i=0;i<n;i++){
            left=i-PLE[i];
            right= NLE[i]-i;
            long freq= (left* right)*1L;
            int val= (int) ((freq*arr[i])%mod);
            sum =(sum+val)%mod;
        }
        return sum;
        
    }
    
    public static int[] nle(int[] arr){
        int n=arr.length;
        int[] ans= new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty())  ans[i]=n;
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;

    }

    public static int[] ple(int[] arr){
         int n=arr.length;
        int[] ans= new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty())  ans[i]=-1;
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}
