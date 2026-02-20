package StackAndQueue;

public class TappingRainWater {

    public static void main(String[] args) {
       int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
       int ans =trap(height);
       System.out.println(ans);

    }

    public static int trap(int[] height) {
//Better Approach
        // int n= height.length;
        // int[] pre=prefix(height);
        // int[] suf= suffix(height);

        // int lmax=0;
        // int rmax=0;
        // int total=0;

        // for(int i=0;i<n;i++){

        //     lmax= pre[i];
        //     rmax= suf[i];
        //     if(lmax> height[i] && rmax > height[i]){
        //         total += Math.min(lmax,rmax)-height[i];
        //     }
        // }
        // return total;

        //optimal
         int n= height.length;
        int left=0;
        int right =n-1;
        int maxLeft=0;
        int maxRight=0;
        int total=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(maxLeft<height[left]){
                    maxLeft=height[left];
                }
                else{
                    total += maxLeft-height[left];
                }
                left++;
            }
            else{
                if(maxRight<height[right]){
                    maxRight=height[right];
                }
                else{
                    total += maxRight-height[right];
                }
                right--;
            }
        }
        return total;

    }


    public static int[] prefix(int[] arr){

        int n= arr.length;
        int[] pre = new int[n];
        pre[0]= arr[0];
        for(int i=1;i<n;i++){
            pre[i]= Math.max(pre[i-1],arr[i]);
        }
        return pre;
    }

     public static int[] suffix(int[] arr){

        int n= arr.length;
        int[] suf = new int[n];
        suf[n-1]= arr[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]= Math.max(suf[i+1],arr[i]);
        }
        return suf;
    }

}
