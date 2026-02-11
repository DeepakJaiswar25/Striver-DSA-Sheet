package StackAndQueue;

import java.util.Stack;

public class QueueImplUsingStack {

    public static class MyQueue{
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1= new Stack<>();
        st2= new Stack<>();
    }
    
    public void push(int x) {
        st1.add(x);
    }
    
    public int pop() {

        int s= st1.size();
        if(st2.size()!=0){
            return st2.pop();
        }
        else{
            for(int i=1;i<=s;i++){
            st2.add(st1.peek());
            st1.pop();
            }  
        }
        return st2.pop();
    }
    
    public int peek() {
        int s=st1.size();
          if(st2.size()!=0){
            return st2.peek();
        }
        else{
           for(int i=1;i<=s;i++){
            st2.add(st1.peek());
            st1.pop();
            } 
        }
        return st2.peek();
    }
    
    public boolean empty() {
        if(st2.isEmpty() && st1.isEmpty()){
            return true;
        }
        return false;
    }
    }
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element popped is " + q.pop());
        q.push(5);
        System.out.println("The front of the queue is " + q.peek());
        System.out.println("Is the queue empty? " + (q.empty() ? "Yes" : "No"));
        System.out.println("The element popped is " + q.pop());
        System.out.println("The element popped is " + q.pop());
        System.out.println("Is the queue empty? " + (q.empty() ? "Yes" : "No"));
    }

}
