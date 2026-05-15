public class LongestPalindromicSubstring {


    public static void main(String[] args) {
       String s = "a";
       String ans = longestPalindrome(s);
       System.out.println(ans);
    }

    public static String longestPalindrome(String s) {
        int n= s.length();
        String LPS="";
        for(int i=0;i<n;i++){

            String str1= checkPalindrome(s, i, i);
            String str2=checkPalindrome(s, i-1, i);

        if(LPS.length()< str1.length()){
            LPS=str1;
        }
        if(LPS.length()<str2.length()){
             LPS=str2;
        }
        }

        return LPS;
    }

    public static String checkPalindrome(String s, int left, int right){

        while(left>=0 && right<s.length() && s.charAt(left)== s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
    
}
