package BinarySearch;

public class BlockAllocation {
    public static void main(String[] args) {
        int arr[] = {25, 46, 28, 49, 24};
        int m=4;
        int ans= findBlockAllocation(arr, m);
        System.out.println(ans);
    }

    public static int findBlockAllocation(int[] arr,int m){
        int low= Integer.MIN_VALUE;
        int high=0;
        int n= arr.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            low= Math.max(low,arr[i]);
            high= high+ arr[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int student= findNumberofStudents(arr, mid);
            if(student<=m){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;

    }

    public static int findNumberofStudents(int[] arr, int pages){
     int student =1;
     int numOfPages=0;
    int n= arr.length;
     for(int i=0;i<n;i++){
        if(numOfPages+arr[i]<=pages){
            numOfPages+=arr[i];
        }
        else{
            student++;
            numOfPages=arr[i];
        }
     }
     return student;

    }
}
