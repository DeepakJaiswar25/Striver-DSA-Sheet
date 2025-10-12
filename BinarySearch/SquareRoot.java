package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int n= 36;
        int ans= findSquareRoot(n);
        System.out.println(ans);
    }
    public static int findSquareRoot(int n){
        // int ans =1;
        // for(int i=1;i<=n;i++){
        //     if(i*i <=n){
        //         ans=i;
        //     }
        // }
        // return ans;
        int ans =1;
         if(n==0) return 0;
       int low=1; int high =n;
       while(low<=high){
        int mid=low+(high-low)/2;
        if((long)mid*mid<=n){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       }
        return ans;
    }

}
