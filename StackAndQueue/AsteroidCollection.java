package StackAndQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsteroidCollection {

    public static void main(String[] args) {
        int[] asteroids = {3,5,-6,2,-1,4};
         List<Integer> ans= asteroidCollision(asteroids);
        System.out.println(ans);
    }

     public static  List<Integer> asteroidCollision(int[] asteroids) {

        List<Integer> st= new ArrayList<>();
        int n= asteroids.length;
        for(int i=0;i<n;i++){

            if(st.isEmpty() || asteroids[i]>0){
                st.add(asteroids[i]);
            }
            else{

                 while(!st.isEmpty() && st.get(st.size()-1)>0 && st.get(st.size()-1)<Math.abs(asteroids[i])){
                st.removeLast();
            }
            if(!st.isEmpty() && st.get(st.size()-1)==Math.abs(asteroids[i])){
                st.removeLast();
            }
            else if (st.isEmpty() || st.get(st.size() - 1) < 0) {
                    st.add(asteroids[i]);
                }
            }

        }
        return st;
        
    }

}
