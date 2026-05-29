import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


class Interval {
     public int start, end;
     public Interval(int start, int end) {
         this.start = start;
         this.end = end;
      }
 }
public class MeetingRoom2 {
    public static void main(String[] args) {
       int[]  start = {2, 9, 6};
       int[] end = {4, 12, 10};
       int ans = minMeetingRooms(start, end);
       System.out.println(ans);
    }

    public static int minMeetingRooms(int[] start, int[] end) {
       int n= start.length;
       Map<Integer,Integer> mp= new TreeMap<>();
       for(int i=0;i<n;i++){
        mp.put(start[i],mp.getOrDefault(start[i], 0)+1);
        mp.put(end[i],mp.getOrDefault(end[i], 0)-1);
       }
       int overlap= 0;
       int maxOverlap=0;

       for(Map.Entry<Integer,Integer> map: mp.entrySet()){
            overlap=overlap+ map.getValue();
            if(overlap>maxOverlap){
                maxOverlap= overlap;
            }
       }

       return maxOverlap;

    }
}
