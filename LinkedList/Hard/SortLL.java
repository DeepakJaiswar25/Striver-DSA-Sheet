package LinkedListHard;

import java.util.ArrayList;

class ListNode{

    int val ;
    ListNode next;

    ListNode(int data1, ListNode next1){
        this.val=data1;
        this.next=next1;
    }
    ListNode(int data1){
        this.val=data1;
        this.next= null;
    }
}
public class SortLL {
public static void main(String[] args) {
    int[] arr={4,2,1,3};
    ListNode head= convert2LL(arr);
    head= sortList(head);
    print(head);
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
    public static ListNode sortList(ListNode head) {
        // if(head==null) return null;
        // ListNode temp=head;
        // ArrayList<Integer> list= new ArrayList<>();
        // while(temp!=null){
        //     list.add(temp.val);
        //     temp=temp.next;
        // }
        // list.sort(null);
        // temp=head;
        // int i=0;
        // while(temp!=null){
        //     temp.val= list.get(i);
        //     temp=temp.next;
        //     i++;
        // }
        // return head;
       if (head == null || head.next == null) {
            return head;
        }
        ListNode Middle= findMiddle(head);
          ListNode right= Middle.next;
          Middle.next=null;
         ListNode left= head;
      
        left= sortList(left);
        right=sortList(right);
        return merge(left,right);
    }

    public static ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast= head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
     public static ListNode merge(ListNode head1,ListNode head2){
     if(head1==null && head2==null) return null;
    ListNode dummy= new ListNode(-1);
    ListNode temp=dummy;
    ListNode t1= head1;
    ListNode t2= head2;
    while(t1!=null && t2!=null){
        if(t1.val<=t2.val){
            temp.next= t1;
            temp=t1;
            t1=t1.next;
        }
        else{
            temp.next= t2;
            temp=t2;
            t2=t2.next;
        }
    }
    if(t1!=null){
        temp.next=t1;
    }
    if(t2!=null){
        temp.next=t2;
    }
    return dummy.next;
    }
}
