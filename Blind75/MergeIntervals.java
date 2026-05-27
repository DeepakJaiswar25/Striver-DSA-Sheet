import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{1,5},{6,7}};
        int[][] ans=merge(intervals);
        System.out.println(Arrays.deepToString(ans));

    }
    
    public static int[][] merge(int[][] intervals) {

        int n = intervals.length;

        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);

        ArrayList<int[]> list= new ArrayList<>();
        int[] newInterval= intervals[0];
        list.add(newInterval);
        for(int i=1;i<n;i++){
          if(newInterval[1]>=intervals[i][0]){
            newInterval[1]= Math.max(newInterval[1], intervals[i][1]);
          }
          else{
            newInterval=intervals[i];
            list.add(newInterval);
          }
        }
        return list.toArray(new int[list.size()][2]);
    }
}
