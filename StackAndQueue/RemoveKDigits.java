package StackAndQueue;

import java.util.Stack;

public class RemoveKDigits {

    public static void main(String[] args) {
        String num = "9";
        int k=1;
        String ans= removeKdigits(num, k);
        System.out.println(ans);
    }

    public static String removeKdigits(String num, int k) {
        Stack<Character> st= new Stack<>();
        int n=num.length();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && k>0 && (num.charAt(i))< st.peek()){
                st.pop();
                k--;
            }
          st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";

        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        int size= res.length();
        while(size!=0 && res.charAt(size-1)== '0'){
            res.deleteCharAt(size-1);
        }

        res.reverse();
        if(res.length()==0) return "0";
        return res.toString();
    }
}
