package StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;

public class NextSmallerElement {

    public static void main(String[] args) {
        int arr[] = {4, 8, 5, 2, 25};
        ArrayList<Integer> ans=nextSmallerEle(arr);
        System.out.println(ans);

    }
    public static ArrayList<Integer> nextSmallerEle(int[] nums) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        int[] arr=new int[nums.length];
         Stack<Integer> st=new Stack<>();
        int n= nums.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()) arr[i]=-1;
            else{
                arr[i]=st.peek();
            }
            st.push(nums[i]);
        }
        for(int i=0;i<n;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}
