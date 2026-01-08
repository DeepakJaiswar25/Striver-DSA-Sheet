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
public class ReverseNodesKgroup {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        ListNode head= convert2LL(arr);
        // head = reverse(head);
        head= reverseWithKgroup(head,2);
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

    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp= head;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp= front;       
        }
        return prev;
    }

    public static ListNode reverseWithKgroup(ListNode head, int k){
        ListNode temp= head;
        ListNode prev=null;
        ListNode front =null;
        ListNode newHead =null;
        while(temp!=null){    
                ListNode KthNode = getKthNode(temp, k);
                if(KthNode==null){
                    if(prev!=null) prev.next=temp;
                    break;
                }
                front= KthNode.next;
                KthNode.next=null;
                newHead=reverse(temp);
                if(temp==head){
                  head= newHead;
                }
                else{
                    prev.next= newHead;
                }
                prev=temp;
                temp= front;
            }
            temp= temp.next;  
        return head;
    }

    public static ListNode getKthNode(ListNode head,int k){
        ListNode temp= head;
        k -= 1;
        while(temp!=null && k>0){
            k--;
            temp= temp.next;
        }
        return temp;
        }

}
