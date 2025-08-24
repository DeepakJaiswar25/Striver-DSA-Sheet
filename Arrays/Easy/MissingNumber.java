package ArrayPracticeEasy;

public class MissingNumber {
public static void main(String[] args) {
    int[] arr={1,2,4,5};
    int missing= findMissing(arr);
    System.out.println(missing);
}


public static int findMissing(int[] arr){
    // int sum=0;
    // int currsum=0;
    // for(int i=0;i<=arr.length;i++){
    //     sum +=i;
    // }
    //   for(int i=0;i<arr.length;i++){
    //     currsum +=arr[i];
    // }
    // return sum-currsum;
    //This is good but if its greater than 10^5 then it will take time
    // int sum=0;
    // int currsum=0;
    // int n =arr.length;
    // sum= (n*(n+1))/2;
    // for(int i=0;i<arr.length;i++){
    //     currsum +=arr[i];
    // }
    // return sum-currsum;

    // XOR Method 1:
    // int XOR1= 0; int XOR2=0;
    // int n =arr.length;
    // for(int i=1;i<=n+1;i++){
    //     XOR1=XOR1^i;
    // }
    // for(int i=0;i<n;i++){
    //     XOR2=XOR2^arr[i];
    // }
    // return XOR1 ^ XOR2;
    // //XOR Method 2
    int XOR1= 0; int XOR2=0;
    int n =arr.length;
     for(int i=0;i<n;i++){
        XOR1= XOR1 ^ (i+1);
        XOR2= XOR2 ^ arr[i];
    }
    XOR1= XOR1 ^ n+1;
    return XOR1 ^ XOR2;
}
}
