public class Palindrome {
    public static void main(String[] args) {
        int num=4554;
        int revnum=0;
        int newnum=num;
        while(newnum>0){
            int n= newnum%10;
            revnum= (revnum*10)+n;
            newnum= newnum/10;
        }
        if(revnum==num){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
