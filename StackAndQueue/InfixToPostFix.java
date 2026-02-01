package StackAndQueue;

import java.util.Stack;

public class InfixToPostFix {
    public static void main(String[] args) {
       String s = "a*(b+c)/d";
       String ans= convertInfixToPostfix(s);
       System.out.println(ans);
        
    }

    public static String convertInfixToPostfix(String Infix){
        Stack<Character> st= new Stack<>();
        String ans="";
        int n= Infix.length();
        for(int i=0;i<n;i++){
            char ch=Infix.charAt(i);
            if(operand(ch)){
                ans = ans+ ch;
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if (ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                   char c= st.pop();
                    ans += c;
                }
                st.pop();
            }
            else {
                while(!st.isEmpty() && (priority(ch)< priority(st.peek()) || (priority(ch)== priority(st.peek()) && ch !='^' ))){
                    ans +=st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }


    public static boolean operand (char c){

        if(c  >= 'A' && c<='Z' || c>= 'a' && c<='z' || c>='0' && c<='9'){
            return true;
        }
        return false;
    }

    public static int priority(char c){

        if(c=='^'){
            return 3;
        }
        else if(c=='*' || c=='/'){
            return 2;
        }
        else if(c=='+' || c=='-'){
            return 1;
        }
        else{
            return -1;
        }
    }
}
