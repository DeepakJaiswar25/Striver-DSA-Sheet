package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElements {

    public static void main(String[] args) {

        int[] nums={1,2,3,4,3};
        int[] ans=nextGreaterElements(nums);
        System.out.println(Arrays.toString(ans));
        
    }

    public static int[] nextGreaterElements(int[] nums) {
        int[] ans= new int[nums.length];
        Stack<Integer> st=new Stack<>();
        int n= nums.length;
        for(int i=(2*n)-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()) ans[i]=-1;
                else{
                    ans[i]= st.peek();
                }
            }
            st.push(nums[i%n]);
        }
        return ans;
    }
}
