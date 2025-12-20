package LinkedListMedium;
class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

public class LengthOfLoop {
public static void main(String[] args) {
    
}
 public static Node convert2LL(int[] arr){
        Node head= new Node(arr[0]);
        Node mover =head;
        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover= temp;
        }
        return head;
    }

    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int lengthOfLoop(Node head) {
        // Write your code here
        Node slow= head;
        Node fast= head;
        while(fast!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast){
                return findLength(slow,fast);
            }
        }
        return 0;
    }
    public static int findLength(Node slow,Node fast){
        int count=1;
        fast= fast.next;
        while(fast!=slow){
            count++;
            fast= fast.next;
        }
        return count;
    }

}
