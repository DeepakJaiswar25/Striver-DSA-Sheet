public class PalindromicSubstrings {

   public static void main(String[] args) {
     String s = "abc";
     int ans=countSubstrings(s);
    System.out.println(ans);
   }

    public static int countSubstrings(String s) {
        int count=0;
        int n= s.length();
        for(int i=0;i<n;i++){
            count+= findPalindrome(s,i,i);
            count+= findPalindrome(s,i,i+1);
        }
        return count;

    }

    public static int findPalindrome(String s, int left,int right){
        int count=0;
        int n= s.length();
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
    
}
