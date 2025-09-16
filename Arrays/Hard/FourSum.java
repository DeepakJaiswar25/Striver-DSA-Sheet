package ArrayPracticeHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {

    public static void main(String[] args) {
        int[] arr={4,3,3,4,4,2,1,2,1,1};
        int target=9;
        List<List<Integer>> ans= findFourSum(arr,target);
        System.out.println(ans);
    }

    public static List<List<Integer>> findFourSum(int[] arr, int target){
       //Bruteforce
        // int n= arr.length;
        //  Set<List<Integer>> set= new HashSet<>();
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             for(int l=k+1;l<n;l++){
        //                 int sum=arr[i]+arr[j]+arr[k]+arr[l];
        //                 if(sum==target){
        //                     List<Integer> temp= Arrays.asList(arr[i], arr[j], arr[k],arr[l]);
        //                     temp.sort(null);
        //                     set.add(temp);
        //                 }
        //             }
        //         }
        //     }
        // }
        //  List<List<Integer>> ans=new ArrayList<>(set);
        //  return ans;
        //   int n= arr.length;
        // Set<List<Integer>> set= new HashSet<>();
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         Set<Long> hashset=new HashSet<>();
        //         for(int k=j+1;k<n;k++){
        //             long sum = arr[i] + arr[j];
        //             sum += arr[k];
        //             long fourth = target - sum; 
        //             if(hashset.contains(fourth)){
        //                  List<Integer> temp= Arrays.asList(arr[i], arr[j], arr[k],(int)fourth);
        //                  temp.sort(null);
        //                  set.add(temp);
        //             }
        //             hashset.add((long)arr[k]);
        //         }
        //     }
        // }
        //  List<List<Integer>> ans=new ArrayList<>(set);
        //  return ans;
        int n= arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(j!=i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int k= j+1;
                int l=n-1;
                while(k<l){
                    long sum= arr[i]+arr[j];
                sum+= arr[k];
                sum +=arr[l];

                if(sum==target){
                    List<Integer> temp= Arrays.asList(arr[i], arr[j], arr[k],arr[l]);
                    temp.sort(null);
                    ans.add(temp);
                    k++;l--;
                    while(k<l && arr[k]==arr[k-1]){
                        k++;
                    }
                    while(k<l && arr[l]==arr[l+1]){
                        l--;
                    }
                }
                else if((sum<target)){
                    k++;
                }
                else{
                    l--;
                }
                }
                
            }
        }
        return ans;

    }
}
