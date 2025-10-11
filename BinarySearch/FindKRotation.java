package BinarySearch;

public class FindKRotation {
public static void main(String[] args) {
    int[] arr= {2,3,4,1};
   int ans= findKRotation(arr);
   System.out.println(ans);
}

public static int findKRotation(int[] nums){
    int n= nums.length;
        int low=0;
        int high= n-1;
        int ans=Integer.MAX_VALUE;
        int index=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[high]){
                if(nums[low]<ans){
                    ans=nums[low];
                    index=low;
                }
                 break;
            }
            if(nums[low]<=nums[mid]){
                   if(nums[low]<ans){
                    ans=nums[low];
                    index=low;
                } 
                low=mid+1;
            }
                else{
                    if(nums[mid]<ans){
                        ans=nums[mid];
                        index=mid;
                    }
                    high=mid-1;
                }
            }
      return index;
        }
}
