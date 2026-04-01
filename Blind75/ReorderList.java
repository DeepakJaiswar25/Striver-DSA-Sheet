import java.util.ArrayList;

class ListNode {
     int val;
   ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class ReorderList {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        ListNode head= convert2LL(arr);
        reorderList(head);
        print(head);
    }

     public static void reorderList(ListNode head) {
        //Bruteforce
        // ArrayList<Integer> arr= new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     arr.add(temp.val);
        //     temp=temp.next;
        // }
        // int l=0;
        // int r= arr.size()-1;
        // temp=head;
        // while(l<=r){
        //  temp.val=arr.get(l);
        //  temp=temp.next;
        //  l++;
        //  if(r>l){
        //  temp.val= arr.get(r);
        //  temp=temp.next;
        //  r--;
        //  }

        ListNode slow=head;
        ListNode fast=head;
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid= slow;
        print(mid);
        mid= ReverseLL(mid);
        print(mid);
        ListNode temp= head;
        while(mid.next!=null){
            ListNode front = temp.next;
            ListNode midFront= mid.next;
            temp.next=mid;
            mid.next=front;
            temp= front;
            mid=midFront;
        }

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

    public static ListNode ReverseLL(ListNode head){
        ListNode prev= null;
        ListNode temp= head;
        while(temp!=null){
         ListNode front = temp.next;
         temp.next= prev;
         prev= temp;
         temp=front;
        }
       return prev;
    }

    
    
}
