package LinkedListEasy1D;

import LinkedListEasy1D.Array2LL.Node;

public class Array2LL {

     static class Node{
      int data;
      Node next;

       Node(int data1, Node next1){
        this.data= data1;
        this.next= next1;
      }

      Node(int data1){
        this.data=data1;
        this.next= null;
      }

    }
}
class Main{
public static void main(String[] args) {
        int[] arr= {2,4,6,7};
    //    Node y= new Node(arr[0]);
    //    System.out.println(y.data);
     Node head = convertArr2LL(arr);
     System.out.println(head.data);
    //  Node temp= head;

    //  while(temp!=null){
    //     System.out.println(temp.data+" ");
    //     temp= temp.next;
    //  }
     print(head);
     int count = lengthOfLL(head);
     System.out.println("Count:" +count);
    }

    public static void print(Node head){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp= temp.next;
        }
        System.out.println();

    }


    public static int lengthOfLL(Node head){
        Node temp=head;
        int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static Node convertArr2LL(int[] arr){
        Node head= new Node(arr[0]);
        Node mover= head;
        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover =temp;
        }
         return head;
    }
}

