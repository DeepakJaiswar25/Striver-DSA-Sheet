public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = {0,2,0,3,1,0,1,3,2,1};
        int ans= trap(height);
        System.out.println(ans);
    }

    public static int trap(int[] height) {
        
        int n= height.length;
        int[] maxleft=new int[n];
        int[] maxright= new int[n];
        int ans=0;
        maxleft[0] =height[0];
        maxright[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            maxleft[i]= Math.max(height[i],maxleft[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            maxright[i]= Math.max(height[i],maxright[i+1]);
        }

        for(int i=0;i<n;i++){
            ans= ans+ Math.min(maxleft[i],maxright[i])-height[i];
        }
        return ans;
    }
    
}
