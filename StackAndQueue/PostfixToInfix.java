package StackAndQueue;

import java.util.Stack;

public class PostfixToInfix {

    public static void main(String[] args) {
        String s= "ab*c+";
         String ans=postToInfix(s); 
         System.out.println(ans);
    }

    public static String postToInfix(String exp) {
    int n= exp.length();
        Stack<String> st = new Stack<>();
        for(int i=0;i<n;i++){
            char c= exp.charAt(i);
            if(operand(c)){
                st.push(String.valueOf(c));
            }
            else{
               String t1=st.pop();
               String t2=st.pop();
               String text= "("+t2+c+t1+")";
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
