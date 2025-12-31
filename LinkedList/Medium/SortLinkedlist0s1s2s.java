package LinkedListMedium;
class Node{

    int data ;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next= null;
    }
}
public class SortLinkedlist0s1s2s {

    public static void main(String[] args) {
        int[] arr={0,1,2,1,2,0,1};
        Node head=convert2LL(arr);
        head=sort(head);
        print(head);
    }

    public static Node convert2LL(int[] arr){
        Node head= new Node(arr[0]);
        Node mover =head;
        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover= temp;
        }
        return head;
    }

    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node sort(Node head){
        //Bruteforce 
//     if(head== null || head.next==null) return head;
//      int count0=0;
//      int count1=0;
//      int count2=0;

//      Node temp= head;
//      while(temp!=null){
//         if(temp.data==0){
//             count0++;
//         }
//         else if(temp.data==1){
//             count1++;
//         }
//         else{
//             count2++;
//         }
//         temp=temp.next;
//      }

//      temp=head;
//      while(temp!=null){
//         if(count0!=0){
//             temp.data= 0;
//             count0--;
//         }
//         else if(count1!=0){
//             temp.data= 1;
//             count1--;
//         }
//         else{
//             temp.data= 2;
//             count2--;
//         }
//         temp= temp.next;
//      }
//  return head;
    //Optimal
     if(head== null || head.next==null) return head;
     Node zeroNode= new Node(-1);
     Node oneNode = new Node(-1);
     Node twoNode = new Node(-1);

     Node zero = zeroNode;
     Node one = oneNode;
     Node two = twoNode;

     Node temp= head;
     while(temp!=null){
        if(temp.data==0){
            zero.next=temp;
            zero=zero.next;
        }
        else if(temp.data==1){
            one.next=temp;
            one = one.next;
        }
        else{
            two.next=temp;
            two= two.next;
        }
        temp=temp.next;
     }
     if(oneNode.next!=null){
        zero.next= oneNode.next;
     }
     else{
         zero.next= twoNode.next;
     }
     one.next= twoNode.next;
     two.next=null;
     return zeroNode.next;
    }
}
