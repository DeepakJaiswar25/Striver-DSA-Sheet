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
public class DeletionDLL {
    public static void main(String[] args) {
        int[] arr= {2,4,6};
        Node head= convert2DLL(arr);
        // head= deleteHead(head);
        // head= deleteTail(head);
        // head= deleteAtKPosition(head, 1);
        deleteNode(head.next.next);
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

    public static Node deleteHead(Node head){
        if(head == null || head.next==null) return null;
        Node temp = head;
        Node newHead= temp.next;
        newHead.prev= null;
        return newHead;
    }

    public static Node deleteTail(Node head){
        if(head == null || head.next==null) return null;
        Node temp= head;
        while(temp.next!=null){
            temp= temp.next;
        }
        Node prev= temp.prev;
        prev.next=null;
        temp.prev= null;
        return head;
    }

    public static Node deleteAtKPosition(Node head, int k){
        if(head == null) return null;
        int count =0;
        Node temp= head;

        while(temp!=null){
            count++;
            if(count==k) break;
            temp= temp.next;
        }
        Node prev= temp.prev;
        Node front= temp.next;
        if(prev== null && front==null){
            return null;
        }
        else if(prev==null){
            return deleteHead(head);
        }
        else if(front==null){
           return deleteTail(head);
        }
        prev.next= front;
        front.prev= prev;
        temp.next=null;
        temp.prev=null;
        return head;
    }

    public static void deleteNode(Node node){
        Node prev= node.prev;
        Node front =node.next;
        if (front ==null){
            prev.next=null;
            node.prev=null;
            return;
        }
        prev.next=front;
        front.prev= prev;
        node.prev=null;
        node.next=null;
    }
}
