import java.util.Arrays;

public class MeetingRooms {

    public static void main(String[] args) {
       int[][] arr= {{1, 4}, {10, 15}, {7, 10}};
       boolean ans=canAttend(arr);
       System.out.println(ans);

    }

    public static boolean canAttend(int[][] arr) {

       int n=arr.length;
       Arrays.sort(arr, (a,b)->a[0]-b[0]);
       int[] prev= arr[0];
       for(int i=1;i<n;i++){
        if(arr[i][0]<prev[1]){
            return false;
        }
        else{
            prev=arr[i];
        }
       }
       return true;
    }
    
}
