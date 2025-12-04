package StringsMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacters {

    public static void main(String[] args) {
        String s = "Aabb";
        String ans=frequencySort(s);
        System.out.println(ans);
        
    }
    public static String frequencySort(String s) {
          Map<Character,Integer> map= new HashMap<>();
          List<Character>[] arr= new ArrayList[s.length()+1];
          StringBuilder sb= new StringBuilder();
          for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
          }
          for(Map.Entry<Character,Integer> e : map.entrySet()){
            int f= e.getValue();
            if(arr[f]==null) {
                arr[f]= new ArrayList<>();
            }
            arr[f].add(e.getKey());
          }
         for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=null){
                for(Character c:arr[i]){
                    for(int j=0;j<i;j++){
                        sb.append(c);
                    }
                }
            }
         }
        return sb.toString();
    }
}
