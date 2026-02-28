package StackAndQueue;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {
       String s = "()[]{}";
       boolean ans= isValid(s);
       System.out.println(ans);
    }

    public static boolean isValid(String text){

        int n=text.length();
        Stack<Character> st= new Stack<>();
        for(int i=0;i<n;i++){
            char c=text.charAt(i);

            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                char top= st.peek();
                if((c==')' && top=='(') || (c=='}' && top=='{') || (c==']' && top=='[')){
                    st.pop();
                }
                else{
                return false;
                }       
            }
        }
         return st.isEmpty();
    }
}
