import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class CloneGraph {

   
    public static void main(String[] args) {
         Node original = buildGraph();
         Node cloned = cloneGraph(original);
         
        System.out.println("Original Graph:");
        printGraph(original, new HashMap<>());

        System.out.println("\nCloned Graph:");
        printGraph(cloned, new HashMap<>());
        
    }

     public static Node cloneGraph(Node node) {  
        if(node==null) return null;
        HashMap<Node,Node> map=new HashMap<>();
        return dfs(node, map);
    }

     public static Node dfs(Node node, HashMap<Node,Node> map){

        Node newNode= new Node(node.val);
        map.put(node, newNode);

        for(Node neighbor: node.neighbors){
            if(!map.containsKey(neighbor)){
                newNode.neighbors.add(dfs(neighbor,map));
            }
            else{
                newNode.neighbors.add(map.get(neighbor));
            }
        }
        return newNode;  
     }


     public static Node buildGraph() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.addAll(new ArrayList<>
                    (Arrays.asList(node2, node3)));
        node2.neighbors.addAll(new ArrayList<>
                    (Arrays.asList(node1, node3)));
        node3.neighbors.addAll(new ArrayList<>
                    (Arrays.asList(node1, node2, node4)));
        node4.neighbors.addAll(new ArrayList<>
                    (Arrays.asList(node3)));

        return node1;
    }

    public static void printGraph(Node node, HashMap<Node, Boolean> visited) {
    if(node == null || visited.containsKey(node)) return;

    visited.put(node, true);

    System.out.print("Node " + node.val + " -> ");

    for(Node neighbor : node.neighbors){
        System.out.print(neighbor.val + " ");
    }
    System.out.println();

    for(Node neighbor : node.neighbors){
        printGraph(neighbor, visited);
    }
}
    
}
