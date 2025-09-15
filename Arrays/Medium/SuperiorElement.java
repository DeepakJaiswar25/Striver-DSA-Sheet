package ArrayPracticeMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperiorElement {

    public static void main(String[] args) {
        int[] a={1,2,2,1};
        List< Integer > ans=superiorElements(a);
        System.out.println(ans);
        
    }

     public static List< Integer > superiorElements(int []a) {
        //Bruteforce approach
        // int n=a.length;
        // List<Integer> ans= new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     boolean max=true;
        //     for(int j=i+1;j<n;j++){
        //         if(a[j]>=a[i]){
        //             max= false;
        //             break;
        //         }
        //     }
        //     if(max){
        //         ans.add(a[i]);
        //     }
        // }
        // Collections.sort(ans);
        // return ans;
        //Optimal Approach
        int n= a.length;
        List<Integer> ans= new ArrayList<>();
        int maxi= Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(maxi<a[i]){
                maxi= a[i];
                ans.add(a[i]);
            }
        }
        return ans;
    }
}
