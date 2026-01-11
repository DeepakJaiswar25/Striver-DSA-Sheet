package DoubleLinkedList;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1,Node prev1){
        this.data= data1;
        this.next= next1;
        this.prev= prev1;
    }

    Node(int data1){
        this.data= data1;
        this.next=null;
        this.prev= null;
    }
}
public class Array2DLL {

    public static void main(String[] args) {
        int[] arr={2,4,7,9};
        Node head = convert2DLL(arr);
        print(head);

    }

    public static Node convert2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev= head;
        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i],null,prev);
            prev.next=temp;
            prev= temp;
        }
        return head;
    }

    public static void print(Node head){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }

}
