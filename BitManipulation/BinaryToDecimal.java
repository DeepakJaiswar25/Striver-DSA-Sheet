package BitManipulation;

public class BinaryToDecimal {

    public static void main(String[] args) {
        String s="10001000";
        int ans= convertBinarytoDec(s);
        System.out.println(ans);
    }

    public static int convertBinarytoDec(String binary){
        int length= binary.length();
        int pow=1;
        int sum=0;
        for(int i= length-1;i>=0;i--){
           int bit= binary.charAt(i)-'0';
            sum= sum+bit*pow;
            pow=pow*2;
        }
       return sum;
    }

}
