package StackAndQueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] nextGreaterElement = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(nextGreaterElement));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2= nums2.length;
        int[] ans =new int[nums1.length];
        Stack<Integer> st=  new Stack<>();
        HashMap<Integer,Integer> map= new HashMap<>();
       
    for(int i=n2-1;i>=0;i--){
        int curr=nums2[i];
        int greaterElement=-1;
        while(!st.isEmpty() && st.peek()<curr){
                    st.pop();
                }
                if(st.isEmpty())  greaterElement=-1;
                else{
                   greaterElement=st.peek();
                }  
                st.push(curr);
                map.put(curr, greaterElement);
    }

    for(int i=0;i<n1;i++){
        ans[i]= map.get(nums1[i]);
    }

        
        return ans;
    }
}
