public class SumOf2Integers {
    public static void main(String[] args) {
        int a=4; int b=5;
        int ans= getSum(a, b);
        System.out.println(ans);
    }
     
    public static int getSum(int a, int b) {
        int c=0;
        while(b!=0){
            c= a&b;
            a= a^b;
            b=c<<1;
        }
        return a;
    }
}
