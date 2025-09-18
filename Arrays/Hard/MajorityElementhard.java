package ArrayPracticeHard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementhard {
public static void main(String[] args) {
    int[] arr= {1,2,2,3,2};
    List<Integer> ans = findMajorityElement(arr);
    System.out.println(ans);
}

public static List<Integer> findMajorityElement(int[] arr){
    //Better Approach
    // int n=arr.length;
    // int min= (int) (n/3) +1 ;
    // Map<Integer,Integer> map= new HashMap<>();
    // List<Integer> ans = new ArrayList<>();
    // for(int i=0;i<n;i++){
    //     map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    //    if(map.get(arr[i])==min){
    //     ans.add(arr[i]);
    //    }

    //    if(ans.size()>2){
    //     break;
    //    }
    // }
    // return ans;

    //Optimal Approach
    int n=arr.length;
    int count1=0;
    int count2=0;
    int el1=Integer.MIN_VALUE;
    int el2= Integer.MIN_VALUE;
    List<Integer> ans = new ArrayList<>();
    for(int i=0;i<n;i++){
        if(count1==0 && arr[i]!= el2){
            count1=1;
            el1=arr[i];
        }
        else if(count2==0 && arr[i]!= el1){
            count2=1;
            el2=arr[i];
        }
        else if(arr[i]==el1){
            count1++;
        }
        else if(arr[i]==el2){
            count2++;
        }
        else{
            count1--;count2--;
        }
    }

      int c1=0;
      int c2=0;
    for(int i=0;i<n;i++){

        if(arr[i]==el1 ){
            c1++;
        }
        if(arr[i]==el2){
            c2++;
        }
    }
        int min= (int) (n/3 )+1 ;
        if(c1>=min){
            ans.add(el1);
        }
        if(c2>=min){
            ans.add(el2);
        }
        return ans;

}

}
