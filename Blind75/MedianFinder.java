import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
   
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

   
   public MedianFinder() {
    
    maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {

        if(maxHeap.isEmpty() || num<maxHeap.peek()){
            maxHeap.offer(num);
        }
        else{
            minHeap.offer(num);
        }

        if(maxHeap.size()>minHeap.size()+1){
            minHeap.offer(maxHeap.poll());
        }
        else if(maxHeap.size()<minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
        
    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (double)(maxHeap.peek()+minHeap.peek())/2;
        }

        return maxHeap.peek();
    }
   
   
   
   
    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian()); // 1.5
        mf.addNum(3);
        System.out.println(mf.findMedian());
    }



    
}
