public class GCD {
public static void main(String[] args) {
    int N1= 20;
    int N2=15;
   int gcd=1;
   for(int i=1;i<=Math.min(N1,N2);i++){
    if(N1%i==0 && N2%i==0){
        gcd=i;
    }
   }
   System.out.println("GCD : "+gcd);
}    
}
