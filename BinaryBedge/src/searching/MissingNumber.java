package searching;

import java.util.Arrays;

public class MissingNumber {


    public static void main(String[] args) {
        int[] num = {1,2,3,4,6,7,8};
        int n = 8;
        System.out.println(search(num , n));

    }

    static int search(int[] array , int n){

        int m = 0;



        for (int i = 1; i <= n  ; i++) {
            Arrays.sort(array);

//            if(array.length == 1){
//                if(array[m] > i){
//                    return i;
//                }else{
//                    return i+1;
//                }
//            }

                 if ( m >= array.length || array[m] != i) {
                    return i;
                } else {
                    m++;
                }

        }
        return -1;
    }

}
