package BitManipulation;

public class Swap2numbers {

    public static void main(String[] args) {
        int a=5;
        int b=6;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a : "+a +" and  b :"+b);
    }
}
