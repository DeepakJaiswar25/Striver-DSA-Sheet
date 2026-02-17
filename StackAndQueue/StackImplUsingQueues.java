package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplUsingQueues {

   static class MyStack {
    Queue<Integer> q;
    public MyStack() {
       q= new LinkedList<>();
    }
    
    public void push(int x) {
      int s=q.size();
      q.add(x);
      for(int i=1;i<=s;i++){
        q.add(q.peek());
        q.remove();
      } 
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

public static void main(String[] args) {
    MyStack st = new MyStack();
        
        // Array of commands
        String[] commands = {"QueueStack", "push", "push", 
                             "pop", "top", "isEmpty"};
        int[][] inputs = {{}, {4}, {8}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    st.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(st.pop() + " ");
                    break;
                case "top":
                    System.out.print(st.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print(st.empty() ? "true " : "false ");
                    break;
                case "QueueStack":
                    System.out.print("null ");
                    break;
            }
        }
}

}
