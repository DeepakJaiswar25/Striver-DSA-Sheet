package BitManipulation;

public class SetIthBit {

    public static void main(String[] args) {
      int  n = 10 ;
      int k = 2;
      int ans= setKthBit(n,k);
      System.out.println(ans);
    }

    public static int setKthBit(int n,int k){
       return n | (1<<k);
    }
}
