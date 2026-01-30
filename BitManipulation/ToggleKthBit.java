package BitManipulation;

public class ToggleKthBit {

    public static void main(String[] args) {
        int n=9;
        int k=0;
        int ans= toggleBit(n,k);
        System.out.println(ans);
    }
    public static int toggleBit(int n, int k){
        return n^(1<<k);
    }
}
