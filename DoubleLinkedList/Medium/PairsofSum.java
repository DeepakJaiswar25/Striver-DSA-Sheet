package DoubleLinkedListMedium;

import java.util.ArrayList;
import java.util.List;

class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }
     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 }
public class PairsofSum {
public static void main(String[] args) {
    int[] arr= {1, 2 ,3, 4, 9};
    Node head= convert2DLL(arr);
    int sum=5;
    ArrayList<Integer> ans= findPairs(head,sum);
    System.out.println(ans);
}

 public static Node convert2DLL(int[] arr){
        Node head= new Node(arr[0]);
        Node prev=head;
        for(int i=1; i<arr.length;i++){
            Node temp= new Node(arr[i]);
            temp.next=null;
            temp.prev=prev;
            prev.next=temp;
            prev= temp;
        }
        return head;
    }
     public static void print(Node head){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }

     public static ArrayList<Integer> findPairs(Node head, int sum) {
    //  ArrayList<Integer> ans =new ArrayList<>();
    //  Node temp1= head;
    //  while(temp1!=null){
    //     Node temp2= temp1.next;
    //     while(temp2!=null && temp1.data+ temp2.data<=sum){
    //         if(temp1.data+temp2.data==sum){
    //             ans.add(temp1.data);
    //             ans.add(temp2.data);
    //         }
    //         temp2= temp2.next;
    //     }
    //     temp1=temp1.next;
    //  }
    //  return ans;
         ArrayList<Integer> ans =new ArrayList<>();
         Node left=head;
         Node temp= head;
         while(temp.next!=null){
           temp= temp.next;
         }
         Node right= temp;
         while(left.data<right.data){
             if(left.data+right.data==sum){
                ans.add(left.data);
                ans.add(right.data);
                left=left.next;
                right= right.prev;
            }
            else if(left.data+right.data<sum){
                left= left.next;
            }
            else{
                right= right.prev;
            }
         }
         return ans;
}
}
