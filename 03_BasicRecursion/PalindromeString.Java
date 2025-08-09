package BasicRecursion;


public class PalindromeString {
    public static void main(String[] args) {
        String str= "abcda";
        boolean palindrome = palindrome(str, 0);
        if(palindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not an Palindrome");
        }
    }


    public static boolean palindrome(String str,int i){

        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
        return palindrome(str, i+1);
    }
}
