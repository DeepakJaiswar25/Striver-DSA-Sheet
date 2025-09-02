package ArrayPracticeMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternateNumbers {

    public static void main(String[] args) {
       int arr[] = {1,2,-4,-5,3,4};
       int[] a=alternateNumbers(arr);
       System.out.println(Arrays.toString(a));

    }

     public static int[] alternateNumbers(int []nums) {
            // Write your code here.
            int n= nums.length;
            ArrayList<Integer> pos= new ArrayList<>();
            ArrayList<Integer> neg= new ArrayList<>();
            for(int i=0;i<n;i++){
                if(nums[i]<0){
                    neg.add(nums[i]);
                }
                else{
                    pos.add(nums[i]);
                }
            }
            if(pos.size()>neg.size()){
               for(int j=0;j<neg.size();j++){
                nums[j*2]= pos.get(j);
                nums[j*2+1]= neg.get(j);
            }
            int index=2* neg.size();
            for(int k=neg.size();k<pos.size();k++){
                nums[index]=pos.get(k);
                index++;
            }
            }
            else{
            for(int j=0;j<pos.size();j++){
                nums[j*2]= pos.get(j);
                nums[j*2+1]= neg.get(j);
            }
            int index=2* pos.size();
            for(int k=pos.size();k<neg.size();k++){
                nums[index]=neg.get(k);
                index++;
            }
            }
        return nums;
        }
}
