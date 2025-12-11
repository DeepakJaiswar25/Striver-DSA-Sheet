package LinkedListEasy1D;
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
public class SearchElementLL {
 public static void main(String[] args) {
           int[] arr= {2,4,6,7};
        Node head= new Node(arr[0]);
        Node mover= head;
        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover =temp;
        }
       boolean check= CheckIfPresent(head,4);
       System.out.println(check);
    }

     public static boolean CheckIfPresent(Node head,int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val) return true;
            temp=temp.next;
        }
        return false;
    }
}
