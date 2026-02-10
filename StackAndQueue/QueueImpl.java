package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {
        Queue<Integer> pq= new LinkedList<>();
        pq.add(2);
        pq.add(4);
        pq.add(8);
        System.out.println("Size : "+pq.size());
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
         System.out.println("Size After performing operations: "+pq.size());
    }

}
