package Heap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        Heap a = new Heap();
//        l.insertion(50);
//        l.insertion(55);
//        l.insertion(53);
//        l.insertion(52);
//        l.insertion(54);

//        l.display();
//        System.out.println();
//
//        l.delete();
//        l.display();
//        System.out.println();
//
        int[] arr = {5,2,3,1};
        int n = arr.length;

        a.heapSort(arr,n);

        for (int i = 0; i < n; i++){
            System.out.print( arr[i] + " -> ");
        }




//        for (Object c: v
//             ) {
//            System.out.println(Arrays.toString((int[])c));
//        }

//        PriorityQueue<Integer> l = new PriorityQueue<>(Collections.reverseOrder());
//        l.add(50);
//        l.add(55);
//        l.add(53);
//        l.add(52);
//        l.add(54);
//
//        System.out.println(l.peek());
//
//      while (!l.isEmpty()){
//          System.out.println(l.poll());
//      }
    }
}
