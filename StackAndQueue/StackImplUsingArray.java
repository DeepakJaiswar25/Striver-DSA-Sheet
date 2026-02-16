package StackAndQueue;

public class StackImplUsingArray {

   
public static class myStack{
    int capacity =0;;
    int topIndex=-1;
    int[] stackArray;
    public myStack(int n) {
        this.capacity=n; 
        this.stackArray= new int[capacity]; 
    }

    public boolean isEmpty() {
       if(topIndex==-1){
        return true;
       }
       return false;
    }

    public boolean isFull() {
        if(topIndex==(capacity-1)){
            return true;
        }
        return false;
    }

    public void push(int x) {
        if(isFull()){
            return;
        }
       topIndex++;
       stackArray[topIndex]=x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(isEmpty()) return ;
        topIndex--;
    }

    public int peek() {
        // Returns the top element of the stack
        if(isEmpty()) return -1;
        return stackArray[topIndex];
    }
}
    public static void main(String[] args) {
        int n = 3;
        int q = 7;

        int[][] queries = {
            {1, 5},
            {1, 3},
            {1, 4},
            {3},
            {2},
            {5},
            {4}
        };

        myStack stack = new myStack(n);

        for (int i = 0; i < q; i++) {
            int[] query = queries[i];

            if (query[0] == 1) {
                // push
                int value = query[1];
                stack.push(value);

            } else if (query[0] == 2) {
                // pop
                stack.pop();

            } else if (query[0] == 3) {
                // peek / print top
                int top = stack.peek();
                if (top != -1) {
                    System.out.println(top);
                }

            } else if(query[0]==4){
                System.out.println(stack.isEmpty());
            }
            else if(query[0]==5){
                System.out.println(stack.isFull());
            }
            else {
                System.out.println("Unknown operation: " + query[0]);
            }
        }
    }

    
}
