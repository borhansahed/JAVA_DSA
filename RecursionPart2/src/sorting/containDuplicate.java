package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class containDuplicate {
    public static void main(String[] args) {
        int[] arr1= {4,5,8};
        int [] arr2 ={10,9,1,8};
   System.out.println(findTheDistance(arr1 , arr2 , 2));
//        System.out.println(Math.abs(-3));

    }
    static int findTheDistance (int[] arr1 , int[] arr2, int d){

        int count = 0;

        for(int i = 0; i<arr1.length; i++){

            for(int j = 0; j<arr2.length; j++){

                if( Math.abs(arr1[i] -arr2[j] ) <= d && ( Math.abs(arr1[i] -arr2[j]) != d)){
                    count++;
                }
            }
        }
        return count;
    }

}
