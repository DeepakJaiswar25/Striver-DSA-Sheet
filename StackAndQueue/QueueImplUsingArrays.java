package StackAndQueue;

public class QueueImplUsingArrays {
    static class myQueue {

    int capacity;
    int start=-1;
    int end =-1;
    int[] queue;
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        this.capacity=n;
        queue= new int[capacity];
    }

    public boolean isEmpty() {
        // Check if queue is empty
        if(start ==-1 && end ==-1){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        // Check if queue is full
        if(start==0 && end== (capacity-1)){
            return true;
        }
        return false;
    }

    public void enqueue(int x) {
        // Enqueue
        if(isFull()) return;
        if(isEmpty()) {
            start=0;
            end=0;
        }
        else{
             end= (end+1)% capacity;
        }
        queue[end]= x;
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()) return ;
        if(start==end){
            start=-1;
            end=-1;
        }
        else{
            start=(start+1)%capacity;
        }
    }

    public int getFront() {
        // Get front element
        if(isEmpty()) return -1;
    return queue[start];
    }

    public int getRear() {
        // Get last element
         if(isEmpty()) return -1;
         return queue[end];
    }
}
public static void main(String[] args) {
    myQueue q = new myQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.getFront()); // 10
        System.out.println("Rear: " + q.getRear());   // 30

        q.dequeue(); // removes 10

        System.out.println("Front after dequeue: " + q.getFront()); // 20

        q.enqueue(40); // works because circular

        System.out.println("Rear after enqueue: " + q.getRear()); // 40

        // Try overflow
        q.enqueue(50); // Overflow
}

}
