import java.util.Stack;

import org.w3c.dom.Node;

class ListNode {
     int val;
   ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class ReverseLinkedList {
   
    public static void main(String[] args) {
       int[] head ={0,1,2,3};
       ListNode convert2ll = convert2LL(head);
       ListNode reverseList = reverseList(convert2ll);
       print(reverseList);  
    }

     public static ListNode reverseList(ListNode head) {
        
        // ListNode dummyNode= new ListNode(-1);
        //Brute force using Stack 
        // ListNode temp= head;
        // Stack<Integer> st= new Stack<>();
        // while(temp!=null){
        //    st.add(temp.val);
        //    temp= temp.next;
        // }
        // temp=head;
        // while(temp!=null){
        //      temp.val=st.pop();
        //      temp= temp.next;
        // }
        // return head;

        ListNode temp=head;
        ListNode prev= null;
        while(temp!=null){
            ListNode front= temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
           
        }
        return prev;
    }
    
    public static ListNode convert2LL(int[] arr){
        ListNode head= new ListNode(arr[0]);
        ListNode mover =head;
        for(int i=1;i<arr.length;i++){
            ListNode temp= new ListNode(arr[i]);
            mover.next=temp;
            mover= temp;
        }
        return head;
    }

     public static void print(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
