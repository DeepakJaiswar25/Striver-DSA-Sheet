package ArrayPracticeEasy;

public class SingleNumber {
public static void main(String[] args) {
    int[] arr={2,2,1};
   int num= findSingleNumber(arr);
   System.out.println(num);
}

public static int findSingleNumber(int[] arr){
    int n= arr.length;
    //This is Brute force Method
     
    for(int i=0;i<n;i++){
       int count=0;
        for(int j=0;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
      if(count==1){
      return arr[i];
    }
    }
  return -1;
 
//XOR Method
// int XOR1=0;
// for(int i=0;i<n;i++){
//     XOR1 = XOR1 ^ arr[i];
// }
//   return XOR1;
}
}
