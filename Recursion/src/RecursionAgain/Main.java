package RecursionAgain;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println(num(4));
//        Scanner s = new Scanner(System.in);
//         String a  = s.nextLine();

        int[] arr = {4,5,0,1,2};



//        sort(arr, arr.length);
//        System.out.println(Arrays.toString(arr));
//
//
//



    }

    private static void sort(int[] arr, int n){

        if(arr.length == 1 ){
            return;
        }

        int temp = arr[n-1];
        sort(arr, n-1);

        insert(arr,temp);

    }

    private static void insert(int[] arr, int temp){

        if(arr.length == 0 || arr[arr.length-1] <= temp){

        }
    }

    private static int findPivot(int[] arr, int i, int i1) {
         int s = i;
         int e = i1;

         while(s <= e){

             int mid = s + (e - s) /2;
             if( mid < e && arr[mid] > arr[mid + 1] ){
                 return mid;
             } if( mid > s &&  arr[mid] < arr[mid - 1 ]){
                return mid - 1;
             }

             if(arr[mid] <= arr[s]){
                e = mid - 1;
             }else{
                 s = mid + 1;
             }

         }

        return -1;
    }

}
