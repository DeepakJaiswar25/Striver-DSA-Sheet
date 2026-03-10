public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        boolean ans=isPalindrome(s);
        System.out.println(ans);
    }

    public static boolean isPalindrome(String s) {

    //    StringBuilder str= new StringBuilder();
    //    for(char c: s.toCharArray()){

    //     if(Character.isLetterOrDigit(c)){
    //         str.append(Character.toLowerCase(c));
    //     }
    //    }
    //    return str.toString().equals(str.reverse().toString());


    int left=0;
    int right=s.length()-1;
    while(left<right){

        while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
        while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
           return false;
        }
       left++;
       right--;
    }
    return true;
    }

}
