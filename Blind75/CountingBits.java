import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {
        int n=4;
        int[] ans= countBits(n);
        System.out.println(Arrays.toString(ans));
    }
    
    public static int[] countBits(int n) {
        //Brute
        // int[] ans= new int[n+1];
        // for(int i=0;i<=n;i++){
        //     int count=0;
        //     int k=i;
        //     while(k>0){
        //         k=k&(k-1);
        //         count++;
        //     }
        //     ans[i]=count;
        // }
        // return ans;

        //Optimal

        int[] ans= new int[n+1];
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                ans[i]=ans[i/2]+1;
            }
            else{
                ans[i]=ans[i/2];
            }
        }
        return ans;
    }
}
