package BinarySearch;

public class NthRootOfNum {
    public static void main(String[] args) {
        int n=4;
        int m=69;
       int ans=findNthRoot(n, m);
       System.out.println(ans);
    }

    public static int findNthRoot(int n,int m){
        // int ans=-1;
        // for(int i=1;i<=m;i++){

        //     if(Math.pow(i, n)==m){
        //         ans= i;
        //     }
        // }

        // return ans;
       int ans=-1;
        int low=1;
        int high= m;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Math.pow(mid,n)==m){
                return mid;
            }
            if(Math.pow(mid,n)<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;


    }
}
