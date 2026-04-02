class ListNode {
     int val;
   ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



public class MergeTwoSortedLinkedLists {
    
    public static void main(String[] args) {
       int[] list1 = {1,2,4};
       int[] list2 = {1,3,5};
       ListNode LL1= convert2LL(list1); 
       ListNode LL2= convert2LL(list2); 
       ListNode LL=mergeTwoLists(LL1, LL2);
       print(LL);
    }



    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy= new ListNode(-1);
        ListNode temp=dummy;
        ListNode temp1= list1;
        ListNode temp2= list2;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
            temp.next= temp1;
            temp=temp.next;
            temp1= temp1.next;
        }
        else{
            temp.next= temp2;
            temp=temp.next;
            temp2= temp2.next;
        }
        }

        if(temp1!=null){
            temp.next=temp1;
        }
       else{
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
