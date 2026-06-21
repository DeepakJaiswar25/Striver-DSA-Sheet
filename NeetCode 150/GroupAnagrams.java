import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {
      String[]  strs = {"act","pots","tops","cat","stop","hat"};
      List<List<String>> ans= groupAnagrams(strs);
      System.out.println(ans);
    }
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        // int n=strs.length;
        // Map<String,List<String>> map= new HashMap<>();
        // for(int i=0;i<n;i++){
        //      char[] c=strs[i].toCharArray();
        //      Arrays.sort(c);
        //      String sortedString= c.toString();
            
        //     if(map.get(sortedString)==null){
        //       map.put(sortedString,new ArrayList<>());
        //     }
        //     map.get(sortedString).add(strs[i]);
        // }
        // return new ArrayList<>(map.values());

        int n=strs.length;
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String frequencyString= getFrequencyString(strs[i]);
            if(map.get(frequencyString)==null){
                map.put(frequencyString,new ArrayList<>());
            }
            map.get(frequencyString).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    public static String getFrequencyString(String str){

        int[] freq= new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        char c='a';
        StringBuilder s= new StringBuilder();
        for(int i=0;i<26;i++){
            s.append(c);
            s.append(freq[i]);
            c++;
        }

        return s.toString();

    }

   
}
