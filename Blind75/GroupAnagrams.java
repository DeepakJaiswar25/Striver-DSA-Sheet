import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> groupAnagrams = groupAnagrams(strs);
        System.out.println(groupAnagrams);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        Map<String,List<String>> map= new HashMap<>();


        for(int i=0;i<strs.length;i++){
            String frequencyString= getFrequencyString(strs[i]);
             if(map.containsKey(frequencyString)){
                map.get(frequencyString).add(strs[i]);
             }
             else{
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(frequencyString,list);
             }
            System.out.println(frequencyString);

        }
        for(Map.Entry<String,List<String>> val:map.entrySet()){
            ans.add(val.getValue());
        }
        return ans;
    }


    public static String getFrequencyString(String text){

        int[] freq = new int[26];
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)-'a']++;
        }
        char c='a';
        StringBuilder str= new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
            str.append(c);
            str.append(freq[i]);
            } 
            c++;
        }
        return str.toString();
    }
}
