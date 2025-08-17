package ArrayPracticeEasy;

import java.util.ArrayList;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] a={1, 2, 2, 2, 3, 4};
        int[] b={2,2,3,3};
        ArrayList<Integer> intersection = intersection(a, b);
        System.out.println(intersection);
        
    }
    public static ArrayList<Integer> intersection(int[] a,int[] b){

        //Bruteforce Method  time complexity=O(n^2)
        // ArrayList<Integer> ans= new ArrayList<>();
        // int[] visited=new int[b.length];
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<b.length;j++){
        //         if(a[i]==b[j] && visited[j]==0){
        //             ans.add(a[i]);
        //             visited[j]=1;
        //             break;
        //         }
        //         if(b[j]>a[i]){
        //             break;
        //         }
        //     }
        // }
        // return ans;
        //Optimal Method using two pointer
        ArrayList<Integer> ans= new ArrayList<>();
        int i=0;
        int j=0;
        int n=a.length;
        int m=b.length;
        while(i<n && j<m){

            if(a[i]<b[j]){
                i++;
            }
            else if( b[j]<a[i]){
                j++;
            }
            else{
            ans.add(a[i]);
            i++;
            j++;
            }
        }
        return ans;


    }

}
