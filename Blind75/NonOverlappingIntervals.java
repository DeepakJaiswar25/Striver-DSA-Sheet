import java.util.Arrays;

public class NonOverlappingIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,4},{1,4}};
        int ans=eraseOverlapIntervals(intervals);
        System.out.println(ans);
    }

    public static int eraseOverlapIntervals(int[][] intervals) {

        int n= intervals.length;
        if(n==0) return 0;

        Arrays.sort(intervals,(a,b)->a[1]-b[1]);

        int count=1;
        int previous_interval= 0;
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=intervals[previous_interval][1]){
                count++;
                previous_interval=i;
            }
        }      
        return n-count;
    }
    
}
