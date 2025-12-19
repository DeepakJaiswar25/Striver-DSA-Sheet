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
public class Intersectionof2LinkedList {

    public static void main(String[] args) {
        // in
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

     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     ListNode t1= headA;
    //     ListNode t2= headB;
    //     int n1=0;
    //     int n2=0;
    //     while(t1!=null){
    //         n1++;
    //         t1= t1.next;
    //     }
    //     while(t2!=null){
    //         n2++;
    //         t2= t2.next;
    //     }
    //     if(n1<n2){
    //         return collisionPoint(headA,headB,n2-n1);
    //     }
    // return collisionPoint(headB,headA,n1-n2);
    ListNode t1 = headA;
        ListNode t2 = headB;
        while(t1!=t2){
            t1= t1.next;
            t2= t2.next;
            if(t1==t2) return t1;
            if(t1==null) t1= headB;
            if(t2==null) t2 = headA;
        }
        return t1;
    }

    public static ListNode collisionPoint(ListNode small, ListNode large, int d){
        while(d!=0){
            d--;
            large= large.next;
        }
        while(small!= large){
            small=small.next;
            large= large.next;
        }
        return small;
    }
}
