public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height= {1,7,2,5,4,7,3,6};
        int ans=maxArea(height);
        System.out.println(ans);
    }

     public static int maxArea(int[] heights) {
      int n=heights.length;
      int maxArea=0;
      int l=0;
      int r=n-1;
      while(l<r){
        int area= Math.min(heights[l],heights[r])* (r-l);
        maxArea= Math.max(area,maxArea);
        if(heights[l]<heights[r]){
          l++;
        }
        else{
          r--;
        }
      }
      
      return maxArea;
    }
}
