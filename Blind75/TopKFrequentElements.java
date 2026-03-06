import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    
    public static void main(String[] args) {
        
       int[] nums = {1,1,1,2,2,3};
       int k=2;
       int[] topKFrequent = topKFrequent(nums, k); 
       System.out.println(Arrays.toString(topKFrequent));
    }

    public static int[] topKFrequent(int[] nums, int k) {

       //Bruteforce
        // Map<Integer,Integer> map=new HashMap<>();
        // int n= nums.length;
        // for(int i=0;i<n;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        // }
        // List<Integer> arr= new ArrayList<>(map.keySet());
        // arr.sort((a,b) -> map.get(b)-map.get(a));
        // int[] result=new int[k];
        // for(int i=0;i<k;i++){
        //     result[i]= arr.get(i);
        // }
        // return result;

        //Optimal
        Map<Integer,Integer> map=new HashMap<>();
        int n= nums.length;
        List<Integer>[] bucket= new List[n+1];
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }

        for(int key:map.keySet()){
            int freq= map.get(key);
            if(bucket[freq]==null){
                bucket[freq]= new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        List<Integer> topK=new ArrayList<>();
        for(int pos= bucket.length-1; pos>=0 && topK.size()<k;pos--){
            if(bucket[pos]!=null){
                topK.addAll(bucket[pos]);
            }
        }
        return topK.stream()
                    .mapToInt(i ->i)
                    .toArray();
    }
}
