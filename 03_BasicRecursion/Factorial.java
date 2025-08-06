package BasicRecursion;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int factorial = factorial(n);
        System.out.println("Factorial is: "+factorial);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
    
        return n* factorial(n-1);
    }

}
