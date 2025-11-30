package StringsMedium;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
       String s = "cbbd";
       String ans=longestPalindrome(s);
       System.out.println(ans);
    }
    public static String longestPalindrome(String s) {
       int start= 0;
       int end=0;
       for(int center=0;center<s.length();center++){
        int len1=expandFromCenter(s, center, center);
        int len2=expandFromCenter(s, center, center+1);
        int len= Math.max(len1, len2);

        if(end-start<len){
            start= center-(len-1)/2;
            end =center+(len)/2;
        }
       }

        return s.substring(start, end+1);
    }

    public static int expandFromCenter(String s, int left ,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

}
