package StringsEasy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};
       String ans=longestCommonPrefix(strs);
       System.out.println(ans);
    }
    public static String longestCommonPrefix(String[] strs){
        int n= strs.length;
        StringBuilder ans= new StringBuilder();
        Arrays.sort(strs);
        char[] first= strs[0].toCharArray();
        char[] last= strs[n-1].toCharArray();
        for(int i=0;i<n;i++){
            if(first[i]!=last[i]){
                break;
            }
            ans.append(first[i]);
        }
        return ans.toString();
    }

}
