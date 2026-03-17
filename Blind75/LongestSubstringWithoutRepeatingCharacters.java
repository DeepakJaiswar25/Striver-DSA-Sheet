import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
      String s = "pwwkew";
      int ans=lengthOfLongestSubstring(s);
      System.out.println(ans);
        
    }
    
     public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        Set<Character> set=new HashSet<>();
        int max=0;
       while(r<n){
        while(set.contains(s.charAt(r))){
            set.remove(s.charAt(l));
            l++;
        }
        set.add(s.charAt(r));
        max= Math.max(max,r-l+1);
        r++;
       }
        return max;
    }
}
