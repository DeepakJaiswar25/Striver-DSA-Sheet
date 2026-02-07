package StackAndQueue;

import java.util.Stack;

public class PrefixToPostFix {

    public static void main(String[] args) {
        String s= "*-A/BC-/AKL";
        String ans=preToPost(s);
        System.out.println(ans);
    }

     static String preToPost(String pre_exp) {
        // code here
        int n= pre_exp.length();
        Stack<String> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            char c= pre_exp.charAt(i);
            if(operand(c)){
                st.push(String.valueOf(c));
            }
            else{
               String t1=st.pop();
               String t2=st.pop();
               String text= t1+t2+c;
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
