package BitManipulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        int dec=384;
        String binary= decToBinary(dec);
        System.out.println(binary);
    }

    public static String decToBinary(int n){
         StringBuilder binary= new StringBuilder();
        while(n>0){
            int bit= n%2;
            binary.append(bit);
            n=n/2;
        }
         binary.reverse();
        return binary.toString();
    }

}
