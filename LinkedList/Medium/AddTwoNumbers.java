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
public class AddTwoNumbers {
public static void main(String[] args) {
    int[]  l1={9,9,9,9,9,9,9};
    int[]  l2={9,9,9,9};
    Node head1= convert2LL(l1);
    Node head2= convert2LL(l2);
   Node head= addNumber(head1,head2);
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

    public static Node addNumber(Node L1,Node L2){
        Node t1= L1;
        Node t2= L2;
        int carry=0;
        Node dummy= new Node(-1);
        Node current= dummy;
        while(t1!=null || t2!=null){
            int sum= carry;

            if(t1!=null) sum=sum+t1.data;
            if(t2!=null) sum=sum+t2.data;
            
            Node newNode = new Node(sum%10);
            carry= sum/10;
            current.next=newNode;
            current=current.next;
            if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;
        }
        if(carry!=0){
            Node carr = new Node(carry);
            current.next=carr;
        }
    return dummy.next;
    }

}
