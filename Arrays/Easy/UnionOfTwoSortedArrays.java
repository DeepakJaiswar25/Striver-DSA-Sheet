package ArrayPracticeEasy;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
public static void main(String[] args) {
    int[] arr1={1,2,3,4,5};
    int[] arr2={2,3,4,4,5,6};
    List<Integer> union = findUnion(arr1,arr2);
    System.out.println(union);
}

public static List<Integer> findUnion(int[] a, int[] b){
    // bruteforce 
    // Set<Integer> set =new HashSet<>();
    // for(int i=0;i<arr1.length;i++){
    //     set.add(arr1[i]);
    // }
    // for(int i=0;i<arr2.length;i++){
    //     set.add(arr2[i]);
    // }
    // int[] temp=new int[set.size()];
    //  int j=0;
    // for(int i:set){
    //     temp[j++]=i;
    // }
    // return temp;
    //optimal methpd with two pointer
     List<Integer> union= new ArrayList<>();
        int i=0;
        int j=0;
        int n1= a.length;
        int n2= b.length;

        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                if(union.size()==0 || union.get(union.size()-1)!= a[i]){
                    union.add(a[i]);
                }
                    i++;
            }
            else{
                 if(union.size()==0 || union.get(union.size()-1)!= b[j]){
                    union.add(b[j]);
                 }
                    j++;
            }
        }
        while(i<n1){
           if(union.size()==0 || union.get(union.size()-1)!= a[i]){
                    union.add(a[i]);
           }
                    i++;
        }
        while(j<n2){
            if(union.size()==0 || union.get(union.size()-1)!= b[j]){
                    union.add(b[j]);
            }
                    j++;
        }
        return union;
}

}
