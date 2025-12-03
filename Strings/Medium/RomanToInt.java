package StringsMedium;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int ans= romanToInt(s);
        System.out.println(ans);
    }
 
    public static int romanToInt(String s) {
        Map<Character,Integer> map =new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int output=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                output += map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i++;
            }
            else{
                output+=map.get(s.charAt(i));
            }
        }
        return output;
    }
}
