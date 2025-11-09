package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class KthElementSortedArrays {
    public static void main(String[] args) {
        ArrayList<Integer> nums1=new ArrayList<>(Arrays.asList(2, 3, 45));
        ArrayList<Integer> nums2=new ArrayList<>(Arrays.asList(4, 6, 7, 8));
        int k=4;
        int n= nums1.size();
        int m=nums2.size();
        int ans= kthElement(nums1, nums2, n, m, k);
        System.out.println(ans);
    }
    public static int kthElement(ArrayList<Integer> nums1, ArrayList<Integer> nums2, int n, int m, int k){
        if(n>m) return kthElement(nums2,nums1,m,n,k);
        int low=  Math.max(0,k-m);
        int high= Math.min(k,n);
        while(low<=high){
            int mid1= (low+high)/2;
            int mid2= k-mid1;
            int l1= Integer.MIN_VALUE;
            int l2= Integer.MIN_VALUE;
            int r1= Integer.MAX_VALUE;
            int r2= Integer.MAX_VALUE;
            if(mid1<n) r1= nums1.get(mid1);
            if(mid2<m) r2= nums2.get(mid2);
            if(mid1-1>=0) l1= nums1.get(mid1-1);
            if(mid2-1>=0) l2= nums2.get(mid2-1);
            if(l1<r2 && l2<r1){
                return Math.max(l1,l2);
            }
            if(l1>r2){
                high=mid1-1;
            }
            else{
                low= mid1+1;
            }
        }
        return 0;
    }

}
