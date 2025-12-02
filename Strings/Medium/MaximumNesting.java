package StringsMedium;

public class MaximumNesting {
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        int ans=maxDepth(s);
        System.out.println(ans);
    }
    public static int maxDepth(String s) {
        int countOpen=0;
        int maxcount=0;
       for(int i=0; i<s.length();i++){
        if(s.charAt(i)=='('){
            countOpen++;
            if(countOpen>maxcount){
                maxcount=countOpen;
            }
        }
        else if(s.charAt(i)==')'){
                countOpen--;
            }
       }
        return maxcount;
    }

}
