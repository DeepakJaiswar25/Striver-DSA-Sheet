import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
      String  s = "neetcode";
      List<String> wordDict = List.of("neet","code");
      boolean ans= wordBreak(s, wordDict);
      System.out.println(ans);
      
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        
        int len= 0;
        int n=s.length();
        Set<String> set= new HashSet<>(wordDict);
        for(String word:wordDict){
            len= Math.max(len, word.length());
        }

        boolean[] dp= new boolean[n+1];
        dp[0]=true;
        for(int i= 1;i<=n;i++){

            for(int j=i-1;j>=(Math.max(0,i-len));j--){
                if(dp[j]&& set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
       
    }
    
}
