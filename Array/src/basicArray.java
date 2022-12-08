import java.lang.reflect.Array;
import java.util.Arrays;

public class basicArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int n =435;
      System.out.println((Arrays.toString(dropLeft(arr,n))));
    }

//    static boolean allEquals(int[] arr){
//
//
//        if(arr.length == 1){
//            return true;
//        }
//
//        for (int i = 1; i < arr.length; i++) {
//
//            if(arr[i] != arr[i-1]){
//                return false;
//            }
//
//        }
//
//        return true;
//    }

    static  int[] dropLeft(int[] arr, int n){

        if(n > arr.length){
            return new int[]{};
        }
//        int size = arr.length - n;
//        int[] ans = new int[size];
//        int k = 0;
//
//        for (int i = n; i < arr.length ; i++) {
//
//            ans[k] = arr[i];
//            k++;
//
//        }





        return Arrays.copyOfRange(arr,n,arr.length);
    }

}
