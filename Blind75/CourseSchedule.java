import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        boolean ans=canFinish(numCourses, prerequisites);
        System.out.println(ans);

    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();
        int[] inDegree= new int[numCourses];

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pre:prerequisites){
            adj.get(pre[1]).add(pre[0]);
        }

        for(int i=0;i<numCourses;i++){
            for(int it:adj.get(i)){
                inDegree[it]++;
            }
        }

        Queue<Integer> q= new LinkedList<>();
         for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        int count=0;

        while (!q.isEmpty()) {

            int node= q.poll();
            count++;
                for(int it:adj.get(node)){
                    inDegree[it]--;
                    if(inDegree[it]==0){
                        q.add(it);
                    }
                }
        }
       return count==numCourses;
    }
}
