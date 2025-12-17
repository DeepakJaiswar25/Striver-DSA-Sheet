package LinkedListMedium;
class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }
public class DeleteMiddleElement {
public static void main(String[] args) {

    int[] arr ={1,3,4,7,1,2,6};
    Node head = convert2LL(arr);
    head=deleteMiddleElement(head);
    print(head);
    
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

    public static Node deleteMiddleElement(Node head){
        //  if (head== null || head.next==null) return null;
        // Node temp =head;
        // int count =0;
        // while(temp!=null){
        //     count++;
        //     temp= temp.next;
        // }
        // temp= head;
        // int mid= count/2;
        // while(temp!=null){
        //     mid--;
        //     if(mid ==0){
        //         temp.next= temp.next.next;
        //     }
        //     temp= temp.next;
        // }
        // return head;
        //Optimal
        Node slow= head;
        Node fast = head;
        fast= fast.next.next;
        while(fast!=null && fast.next!= null){
            slow= slow.next;
            fast= fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
