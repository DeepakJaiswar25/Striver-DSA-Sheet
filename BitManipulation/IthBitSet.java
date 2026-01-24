package BitManipulation;

public class IthBitSet {

    public static void main(String[] args) {
        int n=12;
        int k=2;
        boolean ans=checkKthBit(n, k);
        System.out.println(ans);
    }

    public static boolean checkKthBit(int n, int k){
       
        if((n & (1<<k))!=0){
         return true;
        }
        return false;
    }

}
