package StringsMedium;

public class Atoi {
    public static void main(String[] args) {
        String s = "42";
        int ans=myAtoi(s);
        System.out.println(ans);
    }
    public static int myAtoi(String s){
       int i=0;
       int n= s.length();
        while(i<n && s.charAt(i)==' ') {
            i++;
        }
        if(i==s.length()) return 0;
       long ans=0;
       int sign=1;
       int min=Integer.MIN_VALUE;
       int max=Integer.MAX_VALUE;
       if(s.charAt(i)=='-'){
        sign=-1;
        i++;
       }
       else if(s.charAt(i)=='+'){
        i++;
       }
       while(i<n && Character.isDigit(s.charAt(i))){
        ans= ans*10 + (s.charAt(i)-'0');
        if(ans*sign<min) return min;
        if(ans* sign>max) return max;
        i++;
       }
       return (int)ans*sign;
    }
}
