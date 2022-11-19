package Subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberSubsets {
    public static void main(String[] args) {

        int[] n = {1,2,2};
//
////        List<List<Integer>> ans = subSet(n);
////       for(List<Integer> num: ans){
////           System.out.println(num);
////       }
//        System.out.println(subSet(n));
        System.out.println(subSet(n));

    }

    static List<List<Integer>> subSet(int[] n){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
       int start = 0;
       int end = 0;

        for(int j = 0; j<n.length; j++){
             start = 0;
            if(j > 0 && n[j] == n[j-1] ){
                start = end + 1;
            }
            end = outer.size() -1;
            int size = outer.size();

            for (int i = start; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(n[j]);
                outer.add(internal);
            }
        }


       return outer;


    }
    static void number (String p , String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch = s.charAt(0);
        number(p, s.substring(1));
        number(p+ch , s.substring(1));
    }
}
