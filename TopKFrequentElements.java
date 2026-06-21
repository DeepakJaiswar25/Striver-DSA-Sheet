import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {
       int[] nums = {1,2,2,3,3,3};
       int k = 2;
       int[] ans=topKFrequent(nums, k);
       System.out.println(Arrays.toString(ans)); 
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int n= nums.length;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        List<Integer>[] bucket=new List[n+1];
        for(int key: map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null){
                bucket[freq]= new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int counter=0;
        int[] ans= new int[k];
        for(int pos=bucket.length-1;pos>=0 && counter<k;pos--){
            if(bucket[pos]!=null){
                for(int i:bucket[pos]){
                    ans[counter++]=i;
                }
            }
        }
        return ans;
    }
}
