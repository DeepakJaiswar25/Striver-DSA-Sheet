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
public class MiddleElement {

public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6};
    Node head=convert2LL(arr);
    head = findMiddleElement(head);
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

    public static Node findMiddleElement(Node head){

        // Node temp = head;
        // int count =0;
        // while(temp!=null){
        //     count++;
        //     temp= temp.next;
        // }
        // int MiddleElement= (count/2)+1;
        // temp= head;
        // while(temp!=null){
        //    MiddleElement--;
        //    if(MiddleElement==0){
        //    break;
        //    } 
        //    temp= temp.next;
        // }
        // return temp;
        // Node temp= head;
        Node slow= head;
        Node fast= head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;

    }
}
