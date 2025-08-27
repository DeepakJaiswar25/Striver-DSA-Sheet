package ArrayPracticeEasy;

public class SecondSmallestAndLargest {
    public static void main(String[] args) {
          int[] arr = {1,1,2,4,7,7,5};
       int n= arr.length;
       int max= largest(arr, n);
       int min= smallest(arr,n);
       System.out.println("Second Smallest: "+min);
        System.out.println("Second Largest: "+max);
    }

 public static int largest(int[] arr, int n){
    if(n<2){
        return -1;
    }
    int max=Integer.MIN_VALUE;
    int secondMax=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            secondMax=max;
            max=arr[i];
        }
        else if(arr[i]>secondMax && max!=arr[i]){
           secondMax=arr[i];
        }
    }

    return secondMax;
 }

  public static int smallest(int[] arr, int n){
    if(n<2){
        return -1;
    }
    int min=Integer.MAX_VALUE;
    int secondMin=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]<min){
            secondMin=min;
            min=arr[i];
        }
        else if(arr[i]<secondMin && min!=arr[i]){
           secondMin=arr[i];
        }
    }

    return secondMin;
 }
}
