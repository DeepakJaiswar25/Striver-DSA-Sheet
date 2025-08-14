package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Countfrequency {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
       
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> val: map.entrySet()){
            System.out.println(val.getKey()+" "+val.getValue());
        }
       
}
    }

