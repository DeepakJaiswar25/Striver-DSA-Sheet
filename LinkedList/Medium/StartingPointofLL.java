package LinkedListMedium;

import java.util.HashMap;
import java.util.Map;

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
public class StartingPointofLL {

    public static void main(String[] args) {
        
    }
    public static ListNode startPoint(ListNode head){
    //    Map<ListNode,Integer> map= new HashMap<>(); 
    //    ListNode temp= head;
    //    while(temp!=null){
    //     if(map.containsKey(temp)){
    //         return temp;
    //     }
    //     map.put(temp, map.getOrDefault(temp, 0)+1);
    //     temp= temp.next;
    //    }
    //    return null;
   ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
