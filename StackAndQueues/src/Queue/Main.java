package Queue;

import Stack.CustomStack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception {
//        CircularQueue list = new CircularQueue(5);
        CircularQueue list = new CircularQueue(3);


        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);

        System.out.println( list.Rear());

      list.display();
//      list.dequeue();
      list.display();






    }

   static Queue<Integer> push(int arr[], int n)
    {
        Queue<Integer> ans = new LinkedList<>();
        int i = 0;
        while(i < n){
            ans.add(arr[i]);
            i++;
        }
        return ans;
    }
}
