package ArrayPracticeEasy;

public class LargeestElement {
    public static void main(String[] args) {
       int[] arr = {8,10,5,7,9};
       int n= arr.length;
       int max= Largest(arr, n);
       System.out.println(max);
    }

     public static int Largest(int[] arr, int n){
     int max=0;
       for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }

        return max;
     }
}
