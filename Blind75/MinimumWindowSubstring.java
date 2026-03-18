public class MinimumWindowSubstring {
	public static void main(String[] args) {
		String s = "OUZODYXAZV";
        String t= "XYZ";
        String ans=minWindow(s, t);
        System.out.println(ans);

	}

     public static String minWindow(String s, String t) {

        int[] mapS= new int[256];
        int[] mapT= new int[256];

        int left=0;
        int minStart=0;
        int minLength= Integer.MAX_VALUE;

        for(char c: t.toCharArray()){
            mapT[c]++;
        }

        for(int right=0;right<s.length();right++){

            mapS[s.charAt(right)]++;
            while(contains(mapT, mapS)){
                if(right-left+1<minLength){
                    minLength=right-left+1;
                    minStart=left;
                }
                mapS[s.charAt(left)]--;
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart+minLength);
        
    }

    public static boolean contains(int[] mapT,int[] mapS){
       for(int i=0;i<256;i++){
        if(mapT[i]>mapS[i]){
            return false;
        }
       }
       return true;
    }


}
