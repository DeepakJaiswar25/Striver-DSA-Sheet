public class ContainerWithMostWater {
    public static void main(String[] args) {
       int[] height = {1,8,6,2,5,4,8,3,7};
       int ans=maxArea(height);
        System.out.println(ans);
    }

     public static int maxArea(int[] height) {

        int n= height.length;
        int maxArea=0;

        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
            int area= Math.min(height[left],height[right])* (right-left);
            maxArea=Math.max(area, maxArea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
    
}
