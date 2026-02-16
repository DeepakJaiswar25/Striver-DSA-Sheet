package StackAndQueue;

import java.util.Stack;

public class StackImpl {
public static void main(String[] args) {
    Stack<Integer> st= new Stack<>();
   
    st.push(1);
    st.push(4);
    st.push(2);
    System.out.println("Size : "+st.size());
    System.out.println(st.peek());

    st.pop();
   System.out.println(st.peek());
   st.pop();
   System.out.println(st.peek());
    System.out.println("Size After performing operations: "+st.size());
}
}
