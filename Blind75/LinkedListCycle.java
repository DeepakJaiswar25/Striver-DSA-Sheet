class ListNode {
     int val;
   ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class LinkedListCycle {
    public static void main(String[] args) {
          // Create nodes
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        // Link nodes: 1 -> 2 -> 3 -> 4
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle: 4 -> 2
        fourth.next = second;

        boolean ans= hasCycle(head);
        System.out.println(ans);
    }

     public static boolean hasCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
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
