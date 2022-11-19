package Pattern;

import java.util.ArrayList;
import java.util.Arrays;

public class WeakestRow {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        boolean ans = 10 / 5 == 2;
//        System.out.println(ans);
       int[] n = {20,8,-6,-14,0,-19,14,4};

        System.out.println(checkIfExist(n));
    }

    static boolean checkIfExist(int[] arr) {

//        int s = 0;
//        int e = arr.length -1;
//        int m = 0;
//
//        while (s <= e){
//            int  mid = s + (e - s) /2;
//
//            if(arr[s] * 2 == arr[e]){
//
//                return true;
//            }
//            if(arr[mid] * 2 == arr[e]){
//                return true;
//            }
//            if( arr[s] * 2 == arr[m]  ){
//               return true;
//            }
//             else{
//                e--;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

            if( i != j  && arr[i] * 2 == arr[j]){
                return true;
            }

            }
        }
//
        return false;
    }
}
