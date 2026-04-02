class ListNode {
     int val;
   ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class RemoveNthnode {
    
public static void main(String[] args) {
   int[] arr = {1,2,3,4};
   int n = 2;
   ListNode head= convert2LL(arr);
   head=removeNthFromEnd(head, n);
   print(head);
}

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==n){
            return head.next;
        }
        temp=head;
        int m=count-n;
        while(m>1){
            temp=temp.next;
            m--;
        }
        temp.next=temp.next.next;

        return head;
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
