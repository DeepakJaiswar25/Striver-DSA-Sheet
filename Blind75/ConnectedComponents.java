import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConnectedComponents {

    public static void main(String[] args) {
      int  n = 5;
      int[][] edges = {{0,1},{1,2},{3,4}};
      int ans= countComponents(n, edges);
      System.out.println(ans);
    }


    public static int countComponents(int n, int[][] edges) {

        List<List<Integer>> adj= new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int count=0;
        boolean[] visited= new boolean[n];
         for(int i=0;i<n;i++){
            if(!visited[i]){
            count++;
            BFS(i,adj,visited);
            }
         }
         return count;
    }

    public static void BFS(int i, List<List<Integer>> adj, boolean[] visited){

        Queue<Integer> q= new LinkedList<>();
        visited[i]=true;
        q.add(i);

        while(!q.isEmpty()){
            int node=q.poll();
            for(int it:adj.get(node)){
                if(!visited[it]){
                visited[it]=true;
                q.add(it);
                }
            }
        }

    }
    
}
