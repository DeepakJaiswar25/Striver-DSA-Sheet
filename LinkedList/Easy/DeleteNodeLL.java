package LinkedListEasy1D;

class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data= data1;
        this.next= next1;
    }
    Node(int data1){
       this.data= data1; 
    }
}

public class DeleteNodeLL {

    public static void main(String[] args) {
        int[] arr={2,4,8,6,1};
        Node Head= convert2LL(arr);
        // Node head = deleteHead(Head);
        //  Node head = deleteTail(Head);
        // Node head= deleteFromPosition(Head,4);
        Node head= deleteFromVal(Head,9);
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

    public static Node deleteHead(Node head){
        if(head==null) return null;
        Node temp= head;
        head = temp.next;
        return  head;
    }

     public static Node deleteTail(Node head){
        if(head==null || head.next==null) return null;
        Node temp= head;
       while(temp.next.next!=null){
        temp=temp.next;
       }
       temp.next=null;
       return head;
    }

    public static Node deleteFromPosition(Node head,int k){
        if (head == null) return null;

        if (k==1){
            head= head.next;
            return head;
        }
        int count =0;
        Node temp= head;
        Node prev=null;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp= temp.next;
        }
        return head;
    }

    public static Node deleteFromVal(Node head, int val){
       if(head==null) return null;
       if(head.data==val){
        head= head.next;
        return head;
       }
       Node temp= head;
       Node prev = null;
       while(temp!=null){
        if(temp.data==val){
            prev.next=prev.next.next;
            break;
        }
        prev=temp;
        temp=temp.next;
       }
        return head;
    }
}
