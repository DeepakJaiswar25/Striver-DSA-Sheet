import java.util.ArrayList;
import java.util.Arrays;

public class InsertIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] ans=insert(intervals, newInterval);
        System.out.println(Arrays.deepToString(ans));
    }

     public static int[][] insert(int[][] intervals, int[] newInterval) {
        
       int n= intervals.length;
        ArrayList<int[]> res= new ArrayList<>();
        int i=0;
        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]= Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]= Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        res.add(newInterval);
        while(i<n){
             res.add(intervals[i]);
             i++;
        }
        return res.toArray(new int[res.size()][2]);
    }
    
}
