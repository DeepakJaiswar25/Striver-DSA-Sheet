package LinkedListMedium;

import java.util.ArrayList;
import java.util.List;

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
public class OddEven {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,6,4,7};
        Node head= convert2LL(arr);
        Node ans= findOddEvenList(head);
        print(ans);
    }


    public static Node findOddEvenList(Node head){
       if(head==null || head.next==null) return head;
       Node odd= head;
       Node even = head.next;
       Node evenhead = head.next;

       while(even!=null && even.next!=null){
         odd.next= odd.next.next;
         even.next= even.next.next;

         odd= odd.next;
         even= even.next;
       }
       odd.next= evenhead;
       return head;
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


}
