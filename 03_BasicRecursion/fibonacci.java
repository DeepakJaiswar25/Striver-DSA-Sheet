package BasicRecursion;

public class fibonacci {

    public static void main(String[] args) {
        int n=6;
        int fibo = fibo(n);
        System.out.println(fibo);
    }

    public static int fibo(int n){
    if(n<=1){
        return n;
    }
    return fibo(n-1)+ fibo(n-2);
    }

}
