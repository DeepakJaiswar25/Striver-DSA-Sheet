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
public class Merge2sortedLL {

    public static void main(String[] args) {
        int[] arr1= {1,2,4};
        int[] arr2= {1,3,4};
        ListNode head1= convert2LL(arr1);
        ListNode head2= convert2LL(arr2);
        ListNode head = merge(head1,head2);
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
  public static ListNode convert(ArrayList<Integer> arr){
        ListNode head= new ListNode(arr.get(0));
        ListNode mover =head;
        for(int i=1;i<arr.size();i++){
            ListNode temp= new ListNode(arr.get(i));
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

    public static ListNode merge(ListNode head1,ListNode head2){
        //Bruteforce
    //.    if(head1==null && head2==null) return null;
    //    ListNode temp1= head1;
    //    ListNode temp2=head2;
    //    ArrayList<Integer> list= new ArrayList<>();
    
    //    while(temp1!=null){
    //     list.add(temp1.val);
    //     temp1=temp1.next;
    //    }
    //    while(temp2!=null){
    //     list.add(temp2.val);
    //     temp2= temp2.next;
    //    }
    //    list.sort(null);
    //    ListNode head=convert(list);
    //    return head;
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
