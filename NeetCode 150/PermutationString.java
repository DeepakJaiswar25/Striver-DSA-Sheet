import java.util.Arrays;

public class PermutationString {

    public static void main(String[] args) {
       String s1 = "abc";
       String s2 = "lecabee";
       boolean ans=checkInclusion(s1, s2);
       System.out.println(ans);
    }

    public static boolean checkInclusion(String s1, String s2) {
     
        // int m= s1.length();
        // int n= s2.length();
        // if(m>n) return false;

        // char[] sorteds1= s1.toCharArray();
        // Arrays.sort(sorteds1);

        // for(int i=0;i<=n-m;i++){
        //     String temp= s2.substring(i,i+m);
        //     char[] sortedtemp = temp.toCharArray();
        //     Arrays.sort(sortedtemp);

        //     if(Arrays.equals(sorteds1, sortedtemp)){
        //         return true;
        //     }
        // }
        // return false;

        int m= s1.length();
        int n= s2.length();
        if(m>n) return false;

        int[] freq1= new int[26];
        int[] freq2= new int[26];

        for(int i=0;i<m;i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int i=0;
        int j=0;
        while(j<n){
            freq2[s2.charAt(j)-'a']++;
            if(j-i+1>m){
                freq2[s2.charAt(i)-'a']--;
                i++;
            }

            if(Arrays.equals(freq1, freq2)){
                return true;
            }
            j++;
        }
        return false;
    }
    
}
