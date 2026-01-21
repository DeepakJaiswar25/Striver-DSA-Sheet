package BitManipulation;

public class CountBits {

    public static void main(String[] args) {
        int n=11;
        int ans= countSetBits(n);
        System.out.println(ans);
    }

    public static int countSetBits(int n){
        //Brute force
    //     int count=0;
    //     while(n>0){
    //     if(n%2==1){
    //         count+=1;
    //     }
    //     n=n>>1;
    //     }
    // return count;
    //best
    // int count=0;
    //     while(n>0){
    //     count += n & 1;
    //     n=n>>1;
    //     }
    // return count;
    //Optimal
     int count=0;
        while(n>0){
        n= n & (n-1);
        count++; 
        }
    return count;
    }
}
