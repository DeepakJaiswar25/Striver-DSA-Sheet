package BitManipulation;

public class RemoveLastSetBit {

  public static void main(String[] args) {
      int n=12;
    int ans= remove(n);
    System.out.println(ans);
  }
    public static int remove(int n){
        return n & (n-1);
    }

}
