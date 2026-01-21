package BitManipulation;

public class CheckOddNumber {
    public static void main(String[] args) {
        int n=11;
        boolean ans= checkIfOdd(n);
        System.out.println(ans);
    }

    public static boolean checkIfOdd(int n){

        if((n&1)==1){
            return true;
        }
        return false;
    }

}
