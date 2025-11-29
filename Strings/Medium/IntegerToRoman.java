package StringsMedium;

public class IntegerToRoman {

    public static void main(String[] args) {
        int num= 3749;
        String ans=intToRoman(num);
        System.out.println(ans);
    }
    public static String intToRoman(int num) {
        String[] thousands={"","M","MM","MMM","MMMM"};
        String[] hundreds={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] units={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        int thousand= num/1000;
        int hundred= (num%1000)/100;
        int ten=(num%100)/10;
        int unit=(num%10);
        
        return thousands[thousand]+hundreds[hundred]+tens[ten]+units[unit];
    }
}
