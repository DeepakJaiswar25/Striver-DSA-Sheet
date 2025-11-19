package StringsEasy;

public class RotateString {

    public static void main(String[] args) {
        String s="abcde";
        String t= "debac";
        boolean ans=rotateString(s,t);
        System.out.println(ans);
    }

    public static boolean rotateString(String s, String goal) {
      String concat= s+s;
      if(concat.contains(goal)){
      return true;
      }
    return false;
    }
}
