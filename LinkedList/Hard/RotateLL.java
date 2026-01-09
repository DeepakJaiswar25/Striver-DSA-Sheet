package LinkedListHard;
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
public class RotateLL {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int k=2;
        ListNode head= convert2LL(arr);
        head= rotatedLL(head,k);
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

    public static ListNode rotatedLL(ListNode head, int k){
        ListNode temp= head;
        int count =1;
        ListNode newHead=null;
        while(temp.next!= null){
        count++;
        temp= temp.next;
        }
        temp.next=head;
        k = k % count;
        int rotate= count-k;
        temp= head;
        while(temp.next!=null){
            rotate--;
            if(rotate==0){
                newHead= temp.next;
                temp.next=null;
                break;
            }
            temp= temp.next;
        }
        return newHead;
    }
}
