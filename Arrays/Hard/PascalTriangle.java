package ArrayPracticeHard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int r=5;
        int c=3;
        int n=5;;
        // int n= findPascalNumber(r-1,c-1);
        // System.out.println(n);
        generateRow(n);
      List<List<Integer>> ans=  pascalTriangList(n);
      System.out.println(ans);
    }
    // public static int findPascalNumber(int r,int c){
    //     int ans=1;
    //     for(int i=0;i<c;i++){
    //         ans= ans * (r-i);
    //         ans=ans /(i+1);
    //     }

    //     return ans;
    // }

    public static void generateRow(int n){
     
        int res=1;
        System.out.print(res + " ");
        for(int i=1;i<n;i++){
         res=res*(n-i);
         res=res/i;
         System.out.print(res+ " ");
        }
        System.out.println();
    }

    public static List<Integer> row(int n){
        List<Integer> res=new ArrayList<>();
        res.add(1);
        int ans=1;
        for(int i=1;i<n;i++){
        ans= ans*(n-i);
        ans= ans/i;
        res.add(ans);
        }

        return res;

    }

    public static List<List<Integer>> pascalTriangList(int n){
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> res=new ArrayList<>();
       for(int i=1;i<=n;i++){
        res= row(i);
        ans.add(res);
       }
     return ans;
    }

}
