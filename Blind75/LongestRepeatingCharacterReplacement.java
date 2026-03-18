public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
       String s = "XYYX";
       int k=2;
       int ans = characterReplacement(s, k);
       System.out.println(ans);
    }


    public static int characterReplacement(String s, int k) {

        int[] freq= new int[26];
        int n= s.length();
        int left=0;
        int maxWindow=0;
        int maxFreq=0;
        for(int right=0;right<n;right++){

            freq[s.charAt(right)-'A']++;
            maxFreq= Math.max(maxFreq,freq[s.charAt(right)-'A']);
            int windowLength=right-left+1;

            if(windowLength-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
           windowLength=right-left+1;
           maxWindow=Math.max(windowLength,maxWindow);
            
        }
        return maxWindow;
    }
}
