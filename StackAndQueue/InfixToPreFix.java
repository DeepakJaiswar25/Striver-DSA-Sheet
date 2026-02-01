package StackAndQueue;

import java.util.Stack;

public class InfixToPreFix {
    public static void main(String[] args) {
        String s = "a*(b+c)/d";
        String infixToPrefix = InfixToPrefix(s);
        System.out.println(infixToPrefix);
    }

    public static String InfixToPrefix(String text){
        text =reverse(text);
        text= swapBrackets(text);
        int n= text.length();
        String ans="";
        Stack<Character> st= new Stack<>();
        for(int i=0;i<n;i++){
            char ch= text.charAt(i);
            if(operand(ch)){
               ans=ans+ch;
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans+= st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && (priority(ch)<priority(st.peek()) || (priority(ch)==priority(st.peek()) && ch == '^'))){
                    ans+= st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans += st.pop();
        }

        ans = reverse(ans);

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

    public static String reverse(String text){
        char[] arr= text.toCharArray();
        int n= text.length();
        int left=0;
        int right=n-1;
        while(left<right){
            char l= arr[left];
            arr[left] = arr[right];
            arr[right]= l;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static String swapBrackets(String s) {
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == '(') arr[i] = ')';
        else if (arr[i] == ')') arr[i] = '(';
    }
    return new String(arr);
}
}
