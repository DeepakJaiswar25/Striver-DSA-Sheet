public class NumOfIslands {
    public static void main(String[] args) {

     char[][] grid = {
    {'1','1','1','0','1'},
    {'1','1','0','0','0'},
    {'0','0','1','0','0'},
    {'0','0','0','1','1'}
     };

     int count=numIslands(grid);
     System.out.println(count);
        
    }
    
    public static int numIslands(char[][] grid) {
        int count=0;
        int m= grid.length;
        int n= grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                count++;
                dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] grid,int i,int j){
        int m= grid.length;
        int n= grid[0].length;
        int[][] directions= {{-1,0},{0,1},{1,0},{0,-1}};
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        for(int[] direction:directions){
            int new_i= i+ direction[0];
            int new_j= j+ direction[1];
             dfs(grid,new_i,new_j);
        }
    }
}
