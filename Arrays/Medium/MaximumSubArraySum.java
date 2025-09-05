package ArrayPracticeMedium;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        // int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int[] arr={-1};
        int sum=findMaximumSubArraySum(arr);
        System.out.println(sum);
    }

    public static int findMaximumSubArraySum(int[] arr){
        //Bruteforce and Better Approach
        // int n= arr.length;
        // int maxsum=0;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum += arr[j];
        //         maxsum=Math.max(sum,maxsum);
        //     }
        // }
        // return maxsum;

        //Optimal approach kadanes algorithm
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
        sum+= arr[i];
       if(sum>maxsum){
        maxsum=sum;
       }
        if(sum<0){
            sum=0;
        }
        }
        return maxsum;
    }
}
