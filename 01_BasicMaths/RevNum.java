public class RevNum {
    public static void main(String[] args) {
        int num=12345;
        int revnum=0;
        while(num>0){
            int n= num%10;
            revnum = (revnum*10)+n;
            num=num/10;
        }
        System.out.println(revnum);
    }
}
