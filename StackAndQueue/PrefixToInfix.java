package StackAndQueue;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String s="*-A/BC-/AKL";
        String ans =preToInfix(s);
        System.out.println(ans);
    }

   public static String preToInfix(String pre_exp) {
        // code here
        int n= pre_exp.length();
        Stack<String> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            char c= pre_exp.charAt(i);
            if(operand(c)){
                st.push(String.valueOf(c));
            }
            else{
                String t1=st.pop();
                String t2=st.pop();
                String text= "("+t1+c+t2+")";
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
