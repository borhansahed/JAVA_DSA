package Pattern;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class day2 {
    public static void main(String[] args) {

//
//        int[][] arr = {{1,9,3}, {4,,10}, {7,8,9}};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

     pattern4(10);
    }

    private static void pattern4 (int n){


        for(int row = 1; row<=n; row++ ){

            for(int col = 1; col<=row; col++){

                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
