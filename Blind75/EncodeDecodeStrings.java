import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecodeStrings {

    public static void main(String[] args) {
      List<String> dummy_input = new ArrayList<>();
      dummy_input.add("Hello");
      dummy_input.add("World");
      String encodedString= encode(dummy_input);
      System.out.println(encodedString);
      List<String> ans= decode(encodedString);
      System.out.println(ans);


    }

     public static String encode(List<String> strs) {

        int n= strs.size();
         StringBuilder str= new StringBuilder();
        for(int i=0;i<n;i++){
            str= str.append(strs.get(i).length()).append("#").append(strs.get(i));
        }
        return str.toString();
        
    }

    public static List<String> decode(String str) {

       List<String> ans= new ArrayList<>();
       int i=0;
       while(i<str.length()){
        int j=i;
        while(str.charAt(j)!='#'){
            j++;
        }
        int length= Integer.parseInt(str.substring(i, j));
        j++;
        String word= str.substring(j, j+length);
        ans.add(word);
        i=j+length;
       }
       return ans;
    }

    
}
