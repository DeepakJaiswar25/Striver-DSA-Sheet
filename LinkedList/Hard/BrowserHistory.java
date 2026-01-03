package LinkedListHard;
class Node{
    String data ;
    Node front;
    Node back;
    Node(String data1, Node next1,Node back1){
        this.data=data1;
        this.front=next1;
        this.back= back1;
    }
    Node(String data1){
        this.data=data1;
        this.front= null;
        this.back=null;
    }
    
}
public class BrowserHistory {

    public static void main(String[] args) {
       BrowserHistory obj = new BrowserHistory("leetcode.com");
       obj.visit("google.com");
       obj.visit("facebook.com");
       obj.visit("youtube.com");
       String back1 = obj.back(1);
       String back2 = obj.back(1);
       String forward1 = obj.forward(1);
       obj.visit("linkedin.com");
        String forward2 = obj.forward(2);
        String back3 = obj.back(2);
       String back4 = obj.back(7);
       System.out.println(back1+" "+back2+" "+forward1+" "+forward2+" "+back3+" "+back4);
    }
    Node current;
    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        newNode.back=current;
        current.front= newNode;
        current= newNode;
    }
    
    public String back(int steps) {
        while(steps>0){
            if(current.back!=null){
                current=current.back;
            }
            else{
                break;
            }
            steps--;
        }
        return current.data;
    }
    
    public String forward(int steps) {
        while(steps>0){
            if(current.front!=null){
                current= current.front;
            }
            else{
                break;
            }
            steps--;
        }
        return current.data;
    }
}

