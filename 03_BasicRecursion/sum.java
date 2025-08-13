package BasicRecursion;

public class sum {
    public static void main(String[] args) {
        int n=5;
    int sum1toN = sum1toN(n);
    System.out.println("sum: "+sum1toN);
    }

    public static int sum1toN(int i){
        
       if(i==0)
       return 0;       
       return i+sum1toN(i-1);
    }
}
