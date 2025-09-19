package ArrayPracticeHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{15,18},{8,10}};
      int[][] ans=  merge(intervals);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] merge(int[][] a){
     int n= a.length;
     List<List<Integer>> ans= new ArrayList<>();
     Arrays.sort(a,new Comparator<int[]>() {
        public int compare(int[]a ,int[]b){
            return a[0]-b[0];
        }    
     });

  for(int i=0;i<n;i++){
    int start= a[i][0];
    int end = a[i][1];

    if(!ans.isEmpty() &&  end<=ans.get(ans.size()-1).get(1)){
        continue;
    }
    for( int j=i+1;j<n;j++){
        if(a[j][0]<=end ){
            end=Math.max(end, a[j][1]);
        }
        else{
            
            break;
        }
    }
    ans.add(Arrays.asList(start,end));
}
    int[][] result= new int[ans.size()][2];
    for(int k=0;k<ans.size();k++){
        result[k][0]=ans.get(k).get(0);
        result[k][1]=ans.get(k).get(1);
    }
    return result;
        // int n= a.length;
        // Arrays.sort(a, new Comparator<int[]>() {
        //      public int compare(int[]a, int[] b){
        //         return a[0]-b[0];
        //     }          
        // });
        //  List<List<Integer>> ans = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(ans.isEmpty() || a[i][0]> ans.get(ans.size()-1).get(1)){
        //         ans.add(Arrays.asList(a[i][0],a[i][1]));
        //     }
        //     else{
        //         ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1), a[i][1]));
        //     }
        // }
        // return ans;
    }

}
