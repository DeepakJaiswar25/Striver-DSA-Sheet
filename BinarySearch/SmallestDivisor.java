package BinarySearch;

public class SmallestDivisor {

    public static void main(String[] args) {
        int[] nums={1,2,5,9};
        int threshold=6;
        int ans=findSmallestDivisor(nums,threshold);
        System.out.println(ans);
    }
    public static int findSmallestDivisor(int[] nums,int threshold){
        //Bruteforce
        // int n= nums.length;
        // int max=0;
        // int ans=1;
        // for(int i=0;i<n;i++){
        //     max= Math.max(nums[i],max);
        //  }
        // for(int i=1;i<=max;i++){
        //     if( findDivisor(nums, i)<= threshold){
        //         ans = i;
        //         break;
        //     }
            
        // }
        // return ans;
    
        int low=1;
        int ans=1;
        int high=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            high= Math.max(nums[i],high);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int div= findDivisor(nums,mid);
            if(div<=threshold){
                ans=mid;
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
        }
       return ans;
    }
     public static int findDivisor(int[] nums,int div){
        int n=nums.length;
         int sum=0;
        for(int i=0;i<n;i++){
           sum = sum +(int)Math.ceil((double)nums[i]/div);
        }
        return sum;
        
    }
}

