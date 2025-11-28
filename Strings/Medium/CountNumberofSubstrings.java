package StringsMedium;

public class CountNumberofSubstrings {
    public static void main(String[] args) {
     String s = "aba";
     int k = 2;
     int ans=countSubstr(s, k);
     System.out.println(ans);

    }
     public static int countSubstr(String s, int k) {
         if (k <= 0) return 0;      
        return upto(s,k)-upto(s,k-1);
        
    }

    public static int upto(String s, int k){
        int l=0;int r=0; int count=0;
        int[] freq= new int[26];
        int ans=0;
        while(r<s.length()){
            freq[s.charAt(r)-'a']++;
            if(freq[s.charAt(r)-'a']==1) count++;
            while(count>k){
                freq[s.charAt(l)-'a']--;
                if(freq[s.charAt(l)-'a']<=0){
                    count--;
                }
                l++;
            }
            ans += r-l+1;
            r++;
        }
        return ans;
    }
}
