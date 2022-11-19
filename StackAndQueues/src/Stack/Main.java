package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack<Integer> list = new Stack<>();

//        CustomStack list = new CustomStack(4);
//        list.push(3);
//        list.push(2);
//        list.push(4);
//        list.push(5);
//
//
//        System.out.println(list.peek());
//        System.out.println(list.pop());
//        System.out.println(list.pop());
//        System.out.println(list.pop());
//        System.out.println(list.pop());
//        list.push(4);
//        list.push(3);
//        list.push(1);
//        list.push(7);
//        list.push(6);

        long[] n = {1,3,2,4};
        System.out.println(Arrays.toString(nextLargerElement(n,4)));



    }

   static long[] nextLargerElement(long[] arr, int n)
    {


        int k = 0;

        for(int i = 0; i <n; i++){
            for (int j = 0; j < n-1; j++) {

                if(arr[j] < arr[j+1]){
                    arr[j] = arr[j+1];
                    break;
                }

            }
        }

        return arr;
    }
}
