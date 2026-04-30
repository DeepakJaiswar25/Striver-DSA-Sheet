import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlienDictionary {

    public static void main(String[] args) {
        // String[] Input= {"hrn","hrf","er","enn","rfnn"};
          String[] Input= { "abc","bcd","cde"};
  
        String output=foreignDictionary(Input);
        System.out.println(output);

    }
    

    public static String foreignDictionary(String[] words) {

        List<List<Integer>> adj = new ArrayList<>();
        int n= 26;

        boolean[] present=new boolean[26];

        for(String word:words){
            for(char c: word.toCharArray()){
                present[c-'a']=true;
            }
        }

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<words.length-1;i++){
            String s1= words[i];
            String s2= words[i+1];

            if(s1.length()>s2.length() && s1.startsWith(s2)){
                return "";
            }

            int len= Math.min(s1.length(),s2.length());
            for(int j=0;j<len;j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                    break;
                }
            }
        }

      int[] topo= topoSort(n, adj,present);
      StringBuilder ans = new StringBuilder();
      for(int i=0;i<topo.length;i++){
        if(present[topo[i]]){
            ans.append((char)(topo[i]+'a'));
        }
      }

      return ans.toString();
      
    }

    public static int[] topoSort(int k,  List<List<Integer>> adj,boolean[] present){


       int[] inDegree= new int[k];

      for(int i=0;i<k;i++){
         for(int it:adj.get(i)){
            inDegree[it]++;
       }
      }

      Queue<Integer> q= new LinkedList<>();
      for(int i=0;i<k;i++){
        if(inDegree[i]==0 && present[i]){
            q.add(i);
        }
      }
      int[] topo= new int[k];
      int ind=0;
      while (!q.isEmpty()) {
        int node= q.poll();
        topo[ind++]=node;
        for(int it:adj.get(node)){
            inDegree[it]--;
            if(inDegree[it]==0){
                q.add(it);
            }
        }
      }

      return topo;

    }

}
