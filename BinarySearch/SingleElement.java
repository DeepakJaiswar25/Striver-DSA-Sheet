package BinarySearch;

public class SingleElement {

    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};
        int ans= singleNonDuplicate(nums);
        System.out.println(ans);
    }

    public static int singleNonDuplicate(int[] nums){
        //Bruteforce Approach
    //     int n= nums.length;
    //     if(n==1) return nums[0];
    //     for(int i=0;i<n;i++){
    //         if(i==0 && nums[0]!= nums[i+1]) return nums[0];
    //         if(i==(n-1) && nums[n-1]!= nums[n-2]) return nums[n-1];
    //         if(nums[i]!= nums[i+1] && nums[i]!=nums[i-1]){
    //             return nums[i];
    //         }
    //     }
    //  return -1;
//0 1 2 3 4 5 6 7 8
//1,1,2,3,3,4,4,8,8

//[3,3,7,7,10,11,11]
// (even,odd) eleminate left
// (odd,even) eliminate right
    int n= nums.length;
    if(n==1) return nums[0];
    if(nums[0]!= nums[1]) return nums[0];
    if(nums[n-1]!=nums[n-2]) return nums[n-1];
    int low=0; int high=n-1;
    while(low<=high){
       int mid=(low+high)/2;
       if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
       if(mid%2==1 && nums[mid]==nums[mid-1] || mid%2==0 && nums[mid]==nums[mid+1] ){
        low=mid+1;
       }
       else{
        high=mid-1;
       }
    }
    return -1;
    }
}
