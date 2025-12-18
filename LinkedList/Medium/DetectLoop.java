package LinkedListMedium;
class ListNode{

    int data ;
    ListNode next;

    ListNode(int data1, ListNode next1){
        this.data=data1;
        this.next=next1;
    }
    ListNode(int data1){
        this.data=data1;
        this.next= null;
    }
}
public class DetectLoop {

    public static void main(String[] args) {


        
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
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
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
