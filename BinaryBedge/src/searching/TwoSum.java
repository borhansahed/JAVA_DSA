package searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {0,6,5,7,8,0,0};
        int ans = specialArray(arr);
//        int[] ans = twoSum(arr, target);
        System.out.println(ans);
    }

     static int specialArray(int[] arr) {

        int[] num = new int[1001];

         int total = arr.length;

        for(int n : arr)
            num[n]++;


         for (int i = 0; i < 1001; i++) {
             if(i == total){
                 return i;
             }
             total -= num[i];
         }

        return -1;
    }

    static int[] twoSum(int[] numbers, int target) {

        int s = 0;
        int e = numbers.length-1;
        while(s <= e){

        if(numbers[s]+numbers[e] > target){
           e--;
        }
        else if(numbers[s] + numbers[e] < target){

                s = s+1;
            }else{
            return new int[]{s+1,e+1};
        }
        }

        return new int[]{-1,-1};
    }
}
