package Recurrsion;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Day2 {
    public static void main(String[] args) {

    int[] arr = {1,2,3,4,5,6};
        DecimalFormat df = new DecimalFormat("#.00");
    String[] s = {"mobile","mouse","moneypot","monitor","mousepad"};
    String se = "mouse";
        System.out.println(suggestedProducts(s,se));
//        System.out.println(fibonacci(10));
//        System.out.println(search(arr,3432, 0, arr.length-1));
    }

    private static int fibonacci(int n){


        if(n <= 2){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);

    }

    private static int search(int[] arr, int t, int s , int e){

        if( s > e){
            return -1;
        }

        int mid = s + (e - s) /2;

        if(arr[mid] == t){
            return mid;
        }
        if(arr[mid] < t){
            return search(arr,t,mid+1,e);
        }

        return search(arr, t, s, mid-1);
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {

        List<List<String>> ans = new ArrayList<>();

        for(int i = 1; i<=searchWord.length(); i++){
            List<String> temp = new ArrayList<>();
            String ch = searchWord.substring(0,i);
            // System.out.println(ch);

            for(int j = 0; j<products.length; j++){

                if(products[j].indexOf(ch) == 0){
                    temp.add(products[j]);
                }
            }

            ans.add(temp);
        }
        return ans;
    }
}
