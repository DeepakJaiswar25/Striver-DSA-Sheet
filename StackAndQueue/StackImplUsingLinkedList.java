package StackAndQueue;

class Node{
    int data;
    Node next;

    public Node(int data1, Node next1){
        this.data=data1;
        this.next= next1;
    }
    public Node(int data1){
        this.data= data1;
    }
}

public class StackImplUsingLinkedList {
    
static class myStack {
      Node head;;
      int size;

    public myStack() {
        // Initialize your data members

        head=null;
        size=0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(size==0){
            return true;
        }
        return false;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node temp = new Node(x);
        temp.next=head;
        head= temp;
        size++;
    }

    public void pop() {
        // Removes the front element of the stack.
        if(isEmpty()) return;
        head= head.next;
        size--;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(isEmpty()) return -1;
        return head.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return size;
    }
}
public static void main(String[] args) {
    myStack st = new myStack();

        // Array of commands
        String[] commands = {"LinkedListStack", "push", "push", 
                             "pop", "top", "isEmpty"};
        // Array of inputs
        int[][] inputs = {{}, {3}, {7}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            if (commands[i].equals("push")) {
                st.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                st.pop();
                System.out.print("Element Popped out");
            } else if (commands[i].equals("top")) {
                System.out.print(st.peek() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((st.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("LinkedListStack")) {
                System.out.print("null ");
            }
        }
}
}
