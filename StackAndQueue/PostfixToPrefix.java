package StackAndQueue;

import java.util.Stack;

public class PostfixToPrefix {

    public static void main(String[] args) {
        String s="ABC/-AK/L-*";
        String ans= postToPre(s);
        System.out.println(ans);
    }

    static String postToPre(String post_exp) {
        // code here
         int n= post_exp.length();
        Stack<String> st = new Stack<>();
        for(int i=0;i<n;i++){
            char c= post_exp.charAt(i);
            if(operand(c)){
                st.push(String.valueOf(c));
            }
            else{
               String t1=st.pop();
               String t2=st.pop();
               String text= c+t2+t1;
               st.push(text);
                
            }
        }
        return st.peek();
    }
    public static boolean operand (char c){

        if(c  >= 'A' && c<='Z' || c>= 'a' && c<='z' || c>='0' && c<='9'){
            return true;
        }
        return false;
    }
}
