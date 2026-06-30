import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "zxyzxyz";
        int ans=lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    
    public static int lengthOfLongestSubstring(String s) {
       int n= s.length();
       int left=0;
       int maxlen=0;
       Set<Character> set= new HashSet<>();
       for(int right=0;right<n;right++){
        while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
        }

        set.add(s.charAt(right));
        maxlen= Math.max(maxlen, (right-left+1));
       }
       return maxlen;
    }
    
}
