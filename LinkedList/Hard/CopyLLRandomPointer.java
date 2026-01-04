package LinkedListHard;
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CopyLLRandomPointer {
public static void main(String[] args) {
     Node head = new Node(7);
    head.next = new Node(14);
    head.next.next = new Node(21);
    head.next.next.next = new Node(28);

    // Assigning random pointers
    head.random = head.next.next;
    head.next.random = head;
    head.next.next.random = head.next.next.next;
    head.next.next.next.random = head.next;
    
   Node clonedList = cloneLL(head);
   printClonedLinkedList(head);

}
public static void printClonedLinkedList(Node head) {
    while (head != null) {
        System.out.print("Data: " + head.val);
        if (head.random != null) {
            System.out.print(", Random: " + head.random.val);
        } else {
            System.out.print(", Random: null");
        }
        System.out.println();
        // Move to the next node
        head = head.next;
    }
}

public static Node cloneLL(Node head){
   Node temp= head;
   while(temp!=null){
    Node newNode=new Node(temp.val);
    newNode.next=temp.next;
    temp.next=newNode;
    temp=temp.next.next;
   }
   temp= head;
   while(temp!=null){
    if(temp.random!=null){
     temp.next.random= temp.random.next;
    }
   else{
   temp.next.random= null;
   }
   temp=temp.next.next;
   }
   temp=head;
   Node dummyNode =new Node(-1);
   Node res= dummyNode;
   while(temp!=null){
    res.next= temp.next;
    temp.next=temp.next.next;
    res= res.next;
    temp=temp.next;
   }
   return dummyNode.next;
}
}
