package BitManipulation;

public class DivideTwoIntegers {

    public static void main(String[] args) {
        int dividend = 10; int divisor = 3;
        int ans= divide(dividend, divisor);
        System.out.println(ans);
    }

    public static int divide(int dividend, int divisor){
       if(dividend== divisor) return 1;
        if(divisor==1) return dividend;
     if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean isPositive= true;
        if(dividend<0 && divisor>0) isPositive=false;
        if(dividend>0 && divisor<0) isPositive= false;
        long ans=0;
        long n = dividend;
        long d = divisor;

        n = Math.abs(n);
        d = Math.abs(d);
        while(n>=d){
            int count=0;
            while(n>=(d<<(count+1))){
                count++;
            }
             ans += 1L<<count;
             n= n-(d<<count);
        }
        if(ans> Integer.MAX_VALUE && isPositive) return Integer.MAX_VALUE;
        if(ans>Integer.MAX_VALUE && !isPositive) return Integer.MIN_VALUE;
        return isPositive ? (int)ans : (int)(-1* ans);
    }
}
