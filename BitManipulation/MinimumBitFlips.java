package BitManipulation;

public class MinimumBitFlips {
public static void main(String[] args) {
    int start= 10;
    int goal=7;
    int ans= minBitFlip(start,goal);
    System.out.println(ans);
}
public static int minBitFlip(int start,int goal){
    int n= start^ goal;
    int count=0;
    while(n>0){
        count+=n&1;
        n=n>>1;
    }
    return count;
}
}
