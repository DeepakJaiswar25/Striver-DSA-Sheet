package BitManipulation;

public class XORofNumbers {

    public static void main(String[] args) {
        int n=8;
        // int ans= findXOR(n);
        // System.out.println(ans);
        int ans=findXORfromRange(3, 5);
        System.out.println(ans);
    }

    public static int findXOR(int n){

        if(n%4==0){
            return n;
        }
        else if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        return 0;
    }

    public static int findXORfromRange(int L,int R){
        int ans= findXOR(L-1) ^findXOR(R);
        return ans;
    }
}
