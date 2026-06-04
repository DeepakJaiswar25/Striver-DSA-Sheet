public class Numberof1bits {

    public static void main(String[] args) {
        int n=4;
        int ans= hammingWeight(n);
        System.out.println(ans);
    }
    
    public static int hammingWeight(int n) {
     
        int count=0;
        //Bruteforce
        // while(n>0){
        //     if((n%2)==1){
        //         count++;
        //     }
        //     n=n>>1;
        // }
        // return count;

        //Better
        // while(n>0){
        //     count += n&1;
        //     n=n>>1;
        // }
        // return count;

       //Optimal
       while(n>0){
        n= n&(n-1);
        count++;
       }
       return count;
    }
}
