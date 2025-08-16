package ArrayPracticeEasy;

public class CheckArraySorted {
public static void main(String[] args) {
    int[] arr={5,6,7,8};
   boolean output= checkSorted(arr);
   System.out.println(output);
}

public static Boolean checkSorted(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
           return false;
        }
    }
     return true;
}
}
