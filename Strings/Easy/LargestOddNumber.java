package StringsEasy;

public class LargestOddNumber {
    public static void main(String[] args) {
        String num= "52";
        String ans= largestOddNumber(num);
        System.out.println(ans);
    }
    public static String largestOddNumber(String num) {
        int n= num.length()-1;
        for(int i=n;i>=0;i--){
            int digit=num.charAt(i)-'0';
            if(digit%2==1){
                return num.substring(0, i+1);
            }
        }
        return "";
    }

}
