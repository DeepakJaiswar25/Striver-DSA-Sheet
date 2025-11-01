package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls={0,3,4,7,10,9};
        int cows=4;
        int ans= findAggressiveCows(stalls,cows);
        System.out.println(ans);
    }

    public static int findAggressiveCows(int[] stalls, int cows){

        // Arrays.sort(stalls);
        // int ans=-1;
        // int m= stalls.length;
        // int min=stalls[0];
        // int max= stalls[m-1];
        // int n= max-min;
        // for(int i=1;i<n;i++){
        //     if(cowsPossible(stalls, i, cows)==true){
        //         ans=i;
        //         continue;
        //     }
        //     else{
        //         ans=i-1;
        //         break;
        //     }
        // }
        // return ans;
        Arrays.sort(stalls);
        int ans=-1;
        int low=1;
       int m= stalls.length;
        int min=stalls[0];
        int max= stalls[m-1];
        int high= max-min;
        while(low<=high){
            int mid=(low+high)/2;
            if(cowsPossible(stalls, mid, cows)==true){
                ans=mid;
                low=mid+1;
            }
            else{
                high= mid-1;
            }

        }
        return ans;
    }

    public static boolean cowsPossible(int[] stalls,int dist, int cows){
        int n= stalls.length;
        int countcows=1;
        int last= stalls[0];
        for(int i=1;i<n;i++){
            if(stalls[i]-last>=dist){
                countcows++;
                last=stalls[i];
            }
           if(countcows== cows) return true;
        }
         return false;
    }

}
