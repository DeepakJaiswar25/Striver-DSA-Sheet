package StackAndQueue;

public class QueueImplUsingLinkedList {
static class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
static class myQueue {
    Node start;
    Node end;
    int size;
    public myQueue() {
        // Initialize your data members
        start=null;
        end=null;
        size=0;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        if(size==0){
            return true;
        }
        return false;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
          Node temp= new Node(x);
        if(isEmpty()){
            end= temp;
            start= temp;
            size++;
        }
      else{
           end.next=temp;
           end=temp;
           size++;
      }
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(isEmpty()) return ;
        start= start.next;
        size--;
        if(start==null){
            end=null;
        }
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(isEmpty()) return -1;
        return start.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return size;
    }
}

public static void main(String[] args) {
    myQueue q= new myQueue();
     System.out.println("Is queue empty? " + q.isEmpty()); // true

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front element: " + q.getFront()); // 10
        System.out.println("Size: " + q.size());              // 3

        q.dequeue(); // removes 10
        System.out.println("Front after dequeue: " + q.getFront()); // 20

        q.dequeue(); // removes 20
        q.dequeue(); // removes 30

        System.out.println("Is queue empty now? " + q.isEmpty()); 
}
}
