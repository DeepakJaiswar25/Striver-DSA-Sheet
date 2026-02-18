package StackAndQueue;

import java.util.Stack;

public class SumOfSubarrayMinimums {


    public static void main(String[] args) {
       int[] arr = {3,1,2,4};
       int ans=sumSubarrayMins(arr);
       System.out.println(ans);
    }

    public static int sumSubarrayMins(int[] arr) {

        // int mod = (int)1e9 + 7;
        // int n=arr.length;
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     int mini=arr[i];
        //     for(int j=i;j<n;j++){
        //         if(mini>arr[j]){
        //             mini=arr[j];
                
        //         }
        //            sum= (sum+mini)% mod;
        //     }     
        // }
        // return sum;    
        
        int n=arr.length;
        int sum=0;
        int mod = (int)1e9 + 7;
        int[] pse= pse(arr);
        int[] nse=nse(arr);
        int left=0;
        int right=0;
        for(int i=0;i<n;i++){
            left= i-pse[i];
            right=nse[i]-i;
            long freq= (left *right)* 1L;
            int val= (int)((freq* arr[i])%mod);
            sum = (sum+ val)% mod;
        }

    return sum;
    }

    public static int[] nse(int[] arr){

        int n= arr.length;
        int[] ans= new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && arr[st.peek()]>= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i]= n;
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static int[] pse(int[] arr){

        int n= arr.length;
        int[] ans= new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
             while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i]= -1;
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
        }
}
