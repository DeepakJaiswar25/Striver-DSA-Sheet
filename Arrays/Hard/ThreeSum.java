package ArrayPracticeHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
         List<List<Integer>> ans=findThreeSum(arr);
         System.out.println(ans);
    }

    public static List<List<Integer>> findThreeSum(int[] arr){
        // int n=arr.length;
        // Set<List<Integer>> set= new HashSet<>();
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(arr[i]+arr[j]+arr[k]==0){
        //                List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
        //                temp.sort(null);
        //                set.add(temp);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> ans= new ArrayList<>(set);
        // return ans;

        // int n=arr.length;
        // Set<List<Integer>> set= new HashSet<>();
        // for(int i=0;i<n;i++){
        //      Set<Integer> hashset = new HashSet<>();
        //     for(int j=i+1;j<n;j++){
        //        int k= -(arr[i]+arr[j]);
        //        if(hashset.contains(k)){
        //          List<Integer> temp = Arrays.asList(arr[i], arr[j], k);
        //          temp.sort(null);
        //          set.add(temp);
        //        }
        //        hashset.add(arr[j]);
        //        }
        //     }
        //      List<List<Integer>> ans= new ArrayList<>(set);
        //     return ans;

        int n=arr.length;
         List<List<Integer>> ans= new ArrayList<>();
         
        Arrays.sort(arr);        
        for(int i=0;i<n;i++){
            if (i != 0 && arr[i] == arr[i - 1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0){
                j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> list= Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(list);
                    j++;k--;
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    while(j<k && arr[k]==arr[k+1]){
                        k--;
                    }
                }
            }

        }
        return ans;
    }
}
