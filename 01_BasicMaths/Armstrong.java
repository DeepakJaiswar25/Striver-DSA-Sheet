public class Armstrong {

    public static void main(String[] args) {
        int num=153;
        int armstrong=0;
         int k = String.valueOf(num).length();
        int dup=num;
        while(dup>0){
            int n= dup%10;
            armstrong= armstrong+ (int)Math.pow(n, k);
            dup=dup/10;
        }
        if(num== armstrong){
            System.out.println("Armstrong Number");
        }
        else{
             System.out.println("Not an Armstrong Number");
        }
    }
}
