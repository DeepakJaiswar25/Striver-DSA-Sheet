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
public class InsertionDLL {

    public static void main(String[] args) {
        int[] arr= {2,4,6,8,3};
        Node head= convert2DLL(arr);
        // print(head);
        // head= insertHead(head,10 );
        // head = insertTail(head, 100);
        // head= insertAtKposition(head, 6, 10);
        insertBeforeNode(head.next.next.next,10);
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

    public static Node insertHead(Node head,int data){
       if(head== null){
        return new Node(data);
       }
       Node temp=head;
       Node newNode= new Node(data,temp,null);
       temp.prev=newNode;
       return newNode;
    }

    public static Node insertTail(Node head,int data){
        if(head== null){
            return new Node(data);
        }
        Node temp=head;
        while(temp.next!=null){
            temp =temp.next;
        }
        Node prev =temp.prev;
        Node newNode = new Node(data,temp,prev);
        prev.next= newNode;
        temp.prev= newNode;
        return head;
    }

    public static Node insertAtKposition(Node head,int k,int data){
        if(k==1){
            return insertHead(head, data);
        }
        int count =0;
        Node temp= head;
        while(temp!=null){
            count++;
            if(count==k) break;
            temp= temp.next;
        }
        Node prev=temp.prev;     
        Node newNode= new Node(data,temp,prev);
        prev.next= newNode;
        temp.prev=newNode;
        return head;
    }

    public static void insertBeforeNode(Node node, int data){
        Node prev= node.prev;
        Node newNode= new Node(data,node,prev);
        prev.next=newNode;
        node.prev=newNode;
    }
}
