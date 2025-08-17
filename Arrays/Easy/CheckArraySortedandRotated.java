package ArrayPracticeEasy;

public class CheckArraySortedandRotated {
    public static void main(String[] args) {
//    int[] arr={3,4,5,1,2};
//    int[] arr={2,1,3,4};
   int[] arr={1,2,3};
   boolean output= checkSortedandRotated(arr);
   System.out.println(output);
    }
public static Boolean checkSortedandRotated(int[] arr){
    int count=0;
    for(int i=0;i<arr.length;i++){

        if(arr[i]>arr[(i+1)%arr.length]){
        count++;
        }
        if(count>1){
            return false;
        }
    }
     return true;
}
}
