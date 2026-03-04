import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
       String s = "jar"; String t = "jam";
        boolean ans=isAnagram(s, t);
        System.out.println(ans);

    }

    public static boolean isAnagram(String s, String t) {

        //  if(s.length() != t.length()) return false;

        // char[] ca= s.toCharArray();
        // char[] ta= t.toCharArray();
        // int n= ca.length;
        // Arrays.sort(ta);
        // Arrays.sort(ca);

        // for(int i=0;i<n;i++){
        //     if(ca[i]!=ta[i]){
        //         return false;
        //     }
        // }

        // return true;

        if(s.length() != t.length()) return false;
        int[] freq= new int[26];

        int n= s.length();

        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }

        return true;
    }
    
}
