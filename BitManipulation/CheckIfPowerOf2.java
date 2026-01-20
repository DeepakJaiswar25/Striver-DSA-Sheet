package BitManipulation;

public class CheckIfPowerOf2 {

    public static void main(String[] args) {
        int n=9;
        boolean ans= isPowerOfTwo(n);
        System.out.println(ans);
    }

    public static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if((n & (n-1))!=0){
            return false;
        }
        return true;
    }
}
