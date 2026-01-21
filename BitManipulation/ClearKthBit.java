package BitManipulation;

public class ClearKthBit {

    public static void main(String[] args) {
        int n=70;
        int k=2;
        int ans= clear(n,k);
        System.out.println(ans);
    }

    public static int clear(int n,int k){
        
        return n&(~(1<<k));
    }
}
