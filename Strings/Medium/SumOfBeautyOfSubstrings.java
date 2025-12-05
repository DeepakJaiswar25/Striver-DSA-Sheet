package StringsMedium;

public class SumOfBeautyOfSubstrings {
public static void main(String[] args) {
   String s = "aabcbaa";
   int ans= beautySum(s);
   System.out.println(ans);
}
public static int beautySum(String s) {
    int sum=0;
    int n=s.length();
    for(int i=0;i<n;i++){
        int freq[] =new int[26];
        for(int j=i;j<n;j++){
            freq[s.charAt(j)-'a']++;
            int beauty= getMax(freq)-getMin(freq);
            sum+= beauty;
        }
    }
    return sum;
}

public static int getMax(int[] freq){
    int max= 0;
    for(int i=0;i<26;i++){
     max= Math.max(max, freq[i]);
    }
    return max;
}

public static int getMin(int[] freq){
    int min= Integer.MAX_VALUE;
    for(int i=0;i<26;i++){
    if(freq[i]!=0){
        min=Math.min(min, freq[i]);
    }
    }
    return min;
}
}
