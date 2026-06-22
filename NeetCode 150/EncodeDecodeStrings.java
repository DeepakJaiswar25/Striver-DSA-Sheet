import java.util.ArrayList;
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
        StringBuilder encodeString=new StringBuilder();
        for(String str:strs){
            encodeString.append(str.length()).append("#").append(str);
        }
        return encodeString.toString();
    }

    public static List<String> decode(String str) {

        List<String> decodedString= new ArrayList<>();
        int i=0;
        while(i<str.length()){

            int sepidx= str.indexOf("#",i);
            int len=Integer.parseInt( str.substring(i, sepidx));
            i=sepidx+1;
            String decodeString= str.substring(i,i+len);
            decodedString.add(decodeString);
            i=i+len;
        }
        return decodedString;
    }
}
