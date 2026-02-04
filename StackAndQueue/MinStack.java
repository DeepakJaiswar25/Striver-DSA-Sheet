package StackAndQueue;

import java.util.Stack;

public class MinStack {

    Stack<Long> st;
    long min=0;

    public MinStack() {
    st= new Stack<>();
    }
    
    public void push(int val) {
        long x= val;
        if(st.isEmpty()){
            st.push(val);
            min=val;
        }
        else{
            if(val<min){
                st.push(2* x-min);
                min=val;
            }
            else{
                st.push(x);
            }
        }
    }
    
    public void pop() {
        if(st.peek()<min){
            min= 2*min - st.peek();
        }
        st.pop();
    }
    
    public int top() {
        long top = st.peek();
        if(st.peek()<min){
            return (int)min;
        }
        else{
           return (int) top;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
    public static void main(String[] args) {
        MinStack obj = new MinStack();

        obj.push(-2);
        obj.push(0);
        obj.push(-3);

        System.out.println(obj.getMin()); // Output: -3

        obj.pop();

        System.out.println(obj.top());    // Output: 0
        System.out.println(obj.getMin()); //
    }

   
}
