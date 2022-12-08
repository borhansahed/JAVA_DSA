package Recurrsion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Day3 {
//    static  int ans = 0;
    public static  void main (String[] args) throws ParseException {

        //int[] arr = {1,2,3,4,5};
        // System.out.print(reverse(arr, 0, new ArrayList<>()));
        //System.out.println(factorial(6));



//        System.out.println(sumOfDigits(435495));
//        System.out.println(1/10);
//        fun(5);
       int[] arr = new int[1];
        System.out.println(reverseDigits(1345, 0));
//        System.out.println(sumOfDigits(1234));

    }

    private static int reverseDigits(int n,int ans){


        if((n % 10) == 0){
            return ans;
        }

         int rem = n % 10;
        ans = (ans * 10) + rem;
       int num = reverseDigits(n / 10, ans);
        System.out.println(num);

      return num;
    }

    private static  void fun (int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        fun(--n);
    }

    private static int sumOfDigits(int n){

        if(n <= 0){
            return 0;
        }


        int ans = n % 10;

        return ans + sumOfDigits(n/10);
    }

    private static  int factorial(int n){

        if(n <= 1){
            return 1;
        }

        return n* factorial(n-1);




    }
    private static ArrayList reverse(int[] arr, int i, ArrayList<Integer> ans){

        if( i >= arr.length){
            return ans;
        }

        reverse(arr, i+1, ans);
        ans.add(arr[i]);
       return ans;
    }
}
