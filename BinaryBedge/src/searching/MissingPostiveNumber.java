package searching;

import java.util.Arrays;

public class MissingPostiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,10};
        int ans = missingNumber(arr,2);
        System.out.println(ans);
    }

    static int missingNumber(int[] arr, int k){
        int N = arr.length + k;
        int m = 0;
        for (int i = 1; i < N; i++) {

            if(m >= arr.length || arr[m] != i){
                k--;
            }else{
                m++;
            }

            if(k == 0){
                return i;
            }
        }

        return k;
        }


    }


