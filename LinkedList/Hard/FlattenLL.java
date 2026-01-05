package LinkedListHard;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode child1) {
        this.val = data1;
        this.next = next1;
        this.child = child1;
    }
}
public class FlattenLL {
public static void main(String[] args) {
    ListNode head = new ListNode(5);
        head.child = new ListNode(14);

        head.next = new ListNode(4);
        head.next.child = new ListNode(10);

        head.next.next = new ListNode(12);
        head.next.next.child = new ListNode(13);
        head.next.next.child.child = new ListNode(20);

        head.next.next.next = new ListNode(7);
        head.next.next.next.child = new ListNode(17);

        printOriginalLinkedList(head, 0);
         System.out.println();
          ListNode newHead=flattenLinkedList(head);
          printLinkedList(newHead);
}
   public static void printOriginalLinkedList(ListNode head, int depth) {
        while (head != null) {
            System.out.print(head.val);
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }
      public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.child;
        }
        System.out.println();
    }
     public static ListNode convertList2LL(ArrayList<Integer> list){
        ListNode dummyNode= new ListNode(-1);
        ListNode temp=dummyNode;
        for(int i=0;i<list.size();i++){
            ListNode newNode=new ListNode(list.get(i));
            temp.child= newNode;
            temp = newNode;   
        }
        return dummyNode.child;
      }
      public static ListNode flattenLinkedList(ListNode head){
    //     ArrayList<Integer> list= new ArrayList<>();
    //     ListNode temp= head;
    //     while(temp!=null){
    //         list.add(temp.val);
    //         ListNode t2= temp.child;
    //         while(t2!=null){
    //             list.add(t2.val);
    //             t2= t2.child;
    //         }
    //         temp= temp.next;
    //     }
    //    System.out.println(list);
    //    list.sort(null);
    //     System.out.println(list);
    //     ListNode newHead= convertList2LL(list);
    //     return newHead;
        if(head==null || head.next==null) return head;
        ListNode newHead=flattenLinkedList(head.next);
        return merge2LL(head, newHead);
      }

     

      public static ListNode merge2LL(ListNode head1, ListNode head2){
        ListNode t1= head1;
        ListNode t2= head2;
        ListNode dummyNode = new ListNode(-1);
        ListNode temp =dummyNode;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.child=t1;
                temp = t1;
                t1= t1.child;             
            }
            else{
                temp.child=t2;
                temp=t2;
                t2= t2.child;
            }
            temp.next=null;
        }
        if(t1!=null){
            temp.child=t1;
        }
        if(t2!=null){
             temp.child=t2;
        }
        return dummyNode.child;
      }
 
}
