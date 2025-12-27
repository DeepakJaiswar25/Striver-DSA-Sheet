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
public class RemoveNthNode {
    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5};
        int[] arr={1,2};
        Node head= convert2LL(arr);
        int n= 1;
        head= removeNode(head,n);
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

    public static Node removeNode(Node head,int n){
    // if(head==null || head.next==null)  return null;
    // Node temp =head;
    // int count =0;
    // while(temp!=null){
    //     count++;
    //     temp=temp.next;
    // }
    // if(count==n) return head.next;
    
    // int rem= count-n;
    // temp=head;
    // for(int i=1;i<rem;i++){
    //     temp=temp.next;
    // }
    // temp.next=temp.next.next;
    // return head;
    //Slow and Fast Pointer
    Node fast= head;
    Node slow= head;
    for(int i=0;i<n;i++){
        fast= fast.next;
    }
     if(fast==null) {
        return head.next;
    }
    while(fast.next!=null){
        slow=  slow.next;
        fast=  fast.next;
    } 
    slow.next=slow.next.next;
    return head;
    }
}
