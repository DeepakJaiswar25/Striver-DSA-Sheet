package LinkedListMedium;
class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

public class Add1number {

    public static void main(String[] args) {
        int[] arr= {9,9};
        Node head= convert2LL(arr);
        // head =reverse(head);
        head= AddNumber(head);
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

    public static Node reverse(Node head){
        Node temp =head;
        Node prev =null;
        while(temp!=null){
            Node front= temp.next;
            temp.next=prev;
            prev= temp;
            temp=front;
        }
        return prev;
    }

    public static Node AddNumber(Node head){
        
        // Node temp=reverse(head);
        // Node revHead= temp;
        // int carry=1;
        // while(temp!=null){     
        //     carry += temp.data;
        //     if(carry<10){
        //         temp.data=carry;
        //         carry=0;
        //         break;
        //     }
        //     else{
        //         carry=1;
        //         temp.data=0;
        //     }
        //     temp=temp.next;
        // }
        
        // if(carry==1){
        // Node newHead= new Node(1);
        // head = reverse(revHead);
        // newHead.next=head;
        // return newHead;
        // }
        // head = reverse(revHead);
        // return head;

        int carry= helper(head);
        if(carry==1){
            Node newHead= new Node(1);
            newHead.next= head;
            return newHead;
        }
        return head;
    }

    public static int helper(Node head){
        if(head== null ) return 1;
       int carry = helper(head.next);
       head.data= carry+ head.data;
       if(head.data<10){
        return 0;
       }
       head.data=0;
       return 1;
    }
}
