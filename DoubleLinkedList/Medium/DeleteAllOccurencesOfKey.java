package DoubleLinkedListMedium;
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
public class DeleteAllOccurencesOfKey {

    public static void main(String[] args) {
        int[] arr ={10, 4, 10, 3, 5 ,20 ,10};
        Node head= convert2DLL(arr);
        int key= 10;
        head = deleteOccurences(head,key);
        print(head);
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
    public static Node deleteOccurences(Node head,int key){
        Node temp =head;
        while(temp!=null){
            if(temp.data==key){
                if(temp== head){
                    head= head.next;
                }
                Node frontNode= temp.next;
                Node prevNode= temp.prev;
                
                if(frontNode!=null) frontNode.prev= prevNode;
                if(prevNode!=null) prevNode.next= frontNode;
                temp= frontNode;
            }
            else{
                temp= temp.next;
            }      
        }
        return head;
    }
}
