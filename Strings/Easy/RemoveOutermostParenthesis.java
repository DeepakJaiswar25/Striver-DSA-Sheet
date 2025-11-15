package StringsEasy;

public class RemoveOutermostParenthesis {
    public static void main(String[] args) {
      String  s = "(()())(())";
      String ans=removeOuterParentheses(s);
      System.out.println(ans);
    }
    public static String removeOuterParentheses(String s) {
    //     StringBuilder ans=new StringBuilder();
    //     int counter=0;
    //     int n= s.length();
    //     for(int i=0;i<n;i++){
    //         if(s.charAt(i)==')'){
    //             counter--;
    //         }
    //         if(counter!=0){
    //           ans.append(s.charAt(i))  ;
    //         }
    //         if(s.charAt(i)=='('){
    //             counter++;
    //         }
    //     }
    //     return ans.toString();
    // }
    StringBuilder ans=new StringBuilder();
      int counter=0;
      for(char c: s.toCharArray()){
        if(c=='('){
            if(counter>0){
                ans.append(c);
            }
            counter++;
        }
        else if(c==')'){ 
            counter--;
             if(counter>0){
                ans.append(c);
            }
        }
      }
     return ans.toString();
    }
}
