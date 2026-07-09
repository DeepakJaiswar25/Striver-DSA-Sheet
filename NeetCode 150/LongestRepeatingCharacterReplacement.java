public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
       String s = "XYYX";
       int k = 2;
       int ans=characterReplacement(s, k);
       System.out.println(ans);
    }

    public static int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0;
        int[] freq=new int[26];
        int maxfreq=0;
        int maxwindow=0;
        for(int right=0;right<n;right++){

            freq[s.charAt(right)-'A']++;
            maxfreq= Math.max(maxfreq,freq[s.charAt(right)-'A']);

            int windowlength=right-left+1;
            if(windowlength-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowlength=right-left+1;
            maxwindow= Math.max(maxwindow,windowlength);
        }
        return maxwindow;     
    }
}
