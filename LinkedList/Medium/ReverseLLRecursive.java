package LinkedListMedium;
class Node{

    int data ;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next= null;
    }
}
public class ReverseLLRecursive {
public static void main(String[] args) {

    int[] arr={1,2,3,4,5};
    Node head= convert2LL(arr);
    head= reverse(head);
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

    public static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node temp=head;
        Node newHead= reverse(temp.next);
        Node front= head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }

}
