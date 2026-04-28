import java.util.ArrayList;
import java.util.List;

public class PacificAtlantic {
    public static void main(String[] args) {
        int[][] heights = {
                { 4, 2, 7, 3, 4 },
                { 7, 4, 6, 4, 7 },
                { 6, 3, 5, 3, 6 }
        };

        List<List<Integer>> result = pacificAtlantic(heights);
        System.out.println(result);
    }

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m= heights.length;
        int n=heights[0].length;

        boolean[][] pacificVisited= new boolean[m][n];
        boolean[][] atlanticVisited = new boolean[m][n];

        List<List<Integer>> result= new ArrayList<>();

        for(int j=0;j<n;j++){
            DFS(heights, 0, j, Integer.MIN_VALUE, pacificVisited);
            DFS(heights, m-1, j, Integer.MIN_VALUE, atlanticVisited);
        }

        for(int i=0;i<m;i++){
             DFS(heights, i, 0, Integer.MIN_VALUE, pacificVisited);
            DFS(heights, i, n-1, Integer.MIN_VALUE, atlanticVisited);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(atlanticVisited[i][j] && pacificVisited[i][j]){
                    List<Integer> list= new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    result.add(list);
                }
            }
        }
        return result;

    }

    public static void DFS(int[][] heights,int i,int j, int prevVal, boolean[][]visited){
        int[] direction_i= {-1,1,0,0};
        int[] direction_j={0,0,1,-1};
        int m= heights.length;
        int n=heights[0].length;
        if(i<0 || j<0 || i>=m || j>=n || visited[i][j]==true || heights[i][j]<prevVal){
            return;
        }
        visited[i][j]=true;
        for(int k=0;k<4;k++){
            DFS(heights, i+direction_i[k], j+direction_j[k], heights[i][j], visited);
        }
    }

    

}
