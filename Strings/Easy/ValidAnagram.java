package StringsEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s= "ggii";
        String t= "eekk";
        boolean ans=isAnagram(s, t);
        System.out.println(ans);

    }
    public static boolean isAnagram(String s, String t){
        // if(s.length()!=t.length()) return false;
        // char[] sa= s.toCharArray();
        // char[] ta= t.toCharArray();
        // Arrays.sort(sa);
        // Arrays.sort(ta);
        // for(int i=0; i<sa.length;i++){
        //     if(sa[i]!=ta[i]){
        //         return false;
        //     }
        // }
        // return true;
        // if(s.length()!=t.length()) return false;
        // Map<Character,Integer> map= new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        // }
        // for(int j=0;j<t.length();j++){
        //     if(map.containsKey(t.charAt(j))){
        //     map.put(t.charAt(j),map.get(t.charAt(j))-1);
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        // for(Map.Entry<Character,Integer> val: map.entrySet()) {
        //    if(val.getValue()!=0){
        //     return false;
        //    }
        // }    
        //    return true; 
        //optimal solution
        if(s.length()!=t.length()) return false;

        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
        }
        
    }
