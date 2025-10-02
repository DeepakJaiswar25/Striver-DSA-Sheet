package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int arr[] = {3,5,8,9,15,19};
        int x=9;
        int n= arr.length;
        int ans =upperBound(arr, x, n);
        System.out.println(ans);
    }
     public static int upperBound(int []arr, int x, int n){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
