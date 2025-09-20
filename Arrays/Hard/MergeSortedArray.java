package ArrayPracticeHard;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int a[]={1,2,3,0,0,0};
        int m=3;
        int b[]={2,5,6};
        int n=3;
        merge(a,m,b,n);
        System.out.println(Arrays.toString(a));
        
    }

     public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=0;
        int right=0;
        int[] ans= new int[m+n];
        int i=0;
       while(left<m && right<n){
        if(nums1[left]<nums2[right]){
            ans[i++]= nums1[left++];
        }
        else{
            ans[i++]=nums2[right++];
        }
       }
       while(left<m){
         ans[i++]= nums1[left++];
       }
       while(right<n){
         ans[i++]=nums2[right++];
       }
       for(int j=0;j<m+n;j++){
        nums1[j]= ans[j];
       }
    }  

}
