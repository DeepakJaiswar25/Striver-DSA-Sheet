import java.util.PriorityQueue;

public class MergeKSortedLL {
    public static void main(String[] args) {
      
       int[][] lists = {{1,2,4},{1,3,5},{3,6}};

       int n=lists.length;
       ListNode[] LLs= new ListNode[n];
       for(int i=0;i<n;i++){
       ListNode head= convert2LL(lists[i]);
       LLs[i]= head;
       }
       ListNode head= mergeKLists(LLs);
       print(head);
    }


     public static ListNode mergeKLists(ListNode[] lists) {
        //Better 
        // if(lists.length==0) return null;

        // int n=lists.length;
        // ListNode head1= lists[0];
        // for(int i=1;i<n;i++){
        //     head1= merge2Lists(head1, lists[i]);
        // }
        // return head1;

        //Optimal
        PriorityQueue<ListNode> pq= new PriorityQueue<>(
            (a,b)-> Integer.compare(a.val, b.val)
        );
        for(ListNode node:lists){
            if(node!=null){
                 pq.add(node);
            }
        }
        ListNode dummy= new ListNode(-1);
        ListNode temp= dummy;

        while (!pq.isEmpty()) {
            ListNode smallest= pq.poll();
            temp.next=smallest;
            temp=temp.next;
            if(smallest.next!=null){
                pq.add(smallest.next);
            }    
        }
     return dummy.next;
    }

    public static ListNode merge2Lists(ListNode head1, ListNode head2){
        ListNode temp1= head1;
        ListNode temp2= head2;
        ListNode dummy= new ListNode(-1);
        ListNode temp= dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp=temp.next;
                temp1=temp1.next;
            }
            else{
                 temp.next=temp2;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        if(temp1!=null){
            temp.next=temp1;
        }
        if(temp2!=null){
            temp.next=temp2;
        }
        return dummy.next;
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
