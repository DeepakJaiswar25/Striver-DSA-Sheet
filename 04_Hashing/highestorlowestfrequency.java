package Hashing;

import java.util.HashMap;
import java.util.Map;

public class highestorlowestfrequency {
    public static void main(String[] args) {
         int[] arr = {10,5,10,15,10,5};
       
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
       int maxele=0;int minele=0;
       int maxfreq=0; int minfreq=arr.length;
       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
     int count=entry.getValue();
     int element=entry.getKey();
     if(count>maxfreq){
        maxfreq=count;
        maxele=element;
     }
     if(count<minfreq){
        minfreq=count;
        minele=element;
     }
       }
       System.out.println("MinFrequenct element:"+minele +"Max Frequency element"+maxele);
    }

}
