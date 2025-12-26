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
public class Palindrome {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        ListNode head= convert2LL(arr);
        head= reverse(head);
        print(head);
        boolean ans =findPalindrome(head);
        System.out.println(ans);
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

    public static ListNode reverse(ListNode head){

        ListNode temp= head;
        ListNode prev = null;
        while(temp!=null){
            ListNode front =temp.next;
            temp.next= prev;
            prev= temp;
            temp= front;
        }
        return prev;
    }

    public static boolean findPalindrome(ListNode head){

        ListNode slow= head;
        ListNode fast= head;

        while(fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }

        ListNode first= head;
        ListNode second= reverse(slow.next);
        while(second!=null){
            if(first.data!= second.data){
                reverse(second);
                return false;
            }
            first= first.next;
            second= second.next;
        }
        reverse(second);
        return true;
    }
}
