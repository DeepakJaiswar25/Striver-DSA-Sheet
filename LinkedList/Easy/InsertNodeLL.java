package LinkedListEasy1D;

class Node{

    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next= next1;
    }
    Node(int data1){
        this.data= data1;
        this.next= null;
    }
}
public class InsertNodeLL {
public static void main(String[] args) {
     int[] arr={2,4,8,6,1};
    Node Head= convert2LL(arr);
    // Node head= insertHead(Head,100);
    // Node head= insertTail(Head, 100);
    Node head= insertAtPosition(Head,3, 100);
    //  Node head= insertAtVal(Head, 1, 100);
    print(head);
}

public static Node insertHead(Node Head,int val){
    return new Node(val,Head);
}

public static Node insertTail(Node Head,int val){
   if(Head==null) {
    return new Node(val);
   }
    Node temp= Head;
   while(temp.next!=null){
    temp=temp.next;
   }
   temp.next= new Node(val);
   return Head;
}

public static Node insertAtPosition(Node head, int k, int val){
    if(head==null) {
        if(k==1){
        return new Node(val,head);
        }
        else{
            return head;
        }
    }
    if(k==1){
     return new Node(val,head);
    }
    int count =0;
    Node temp=head;
    while(temp!=null && k>1){
        count++;
        if(count==(k-1)){
            Node newNode= new Node(val,temp.next);
            temp.next= newNode;
            break;
        }
        temp=temp.next;
    }
    return head;
}

public static Node insertAtVal(Node head, int val, int data){
    if(head==null) return null;
    if(head.data== val){
        return new Node(data,head);
    }
    Node temp=head;
    while(temp.next!=null){
        if(temp.next.data==val){
            Node newNode= new Node(data,temp.next);
            temp.next= newNode;
            break;
        }
        temp=temp.next;
    }
    return head;
}
public static Node convert2LL(int[] arr){
    Node head = new Node(arr[0]);
    Node mover=head;

   for(int i=1;i<arr.length;i++){
    Node temp= new Node(arr[i]);
    mover.next=temp;
    mover =temp;
   }
   return head;
}

public static void print(Node head){
    Node temp= head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}
}
