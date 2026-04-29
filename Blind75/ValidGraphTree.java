import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ValidGraphTree {

    public static void main(String[] args) {
       int n = 5;
       int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
       boolean ans= validTree(n, edges);
       System.out.println(ans);

    }
    
    public static boolean validTree(int n, int[][] edges) {

        if(edges.length != n-1) return false;

        List<List<Integer>> adj= new ArrayList<>();


        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited= new boolean[n];

        int count=0;
        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        visited[0]= true;

        while(!q.isEmpty()){
            int node= q.poll();
            count++;
            for(int it:adj.get(node)){
                if(!visited[it]){
                    visited[it]=true;
                    q.add(it);
                }
                }
            }

        return count== n;

    }
}
