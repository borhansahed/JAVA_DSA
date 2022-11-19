import java.util.ArrayList;
import java.util.Arrays;

public class factorial {

    public static void main(String[] args) {
        int[] n  = {1,2,3,4,4,10,12};

        System.out.println(BinarySearch(n, 0, n.length-1 , 2));
    }


    static int facto (int n){
        if(n == 0){
            return 0;
        }

        return n - facto(n-1);
    }

    static boolean isSorted(int[] n , int s , int e){
        if( s == n.length){
            return true;
        }



        return n[s] < n[s+1] &&  isSorted(n , s+1 , e);
    }

    static int linearSearch (int[] n , int start , int target){
        if(start == n.length){
            return -1;
        }
        if(n[start] == target){
            return start;
        }
    return  linearSearch(n , start+1 , target);
    }

    static ArrayList firstAndLastIndex(int[] n , int index, int target){

        ArrayList<Integer> list = new ArrayList<>();


        if(index == n.length){
           return list;
        }

        if(n[index] == target){
       list.add(index);

        }
         ArrayList<Integer> indexes = firstAndLastIndex(n , index+1, target);
        list.addAll(indexes);
         return list;


    }
    static int BinarySearch (int[] n , int s , int e , int t){

        if(s > e){
            return -1;
        }
        int m = s + (e-s) /2 ;

        if(n[m] == t){
            return m;
        }
        if(n[m] > t){
          return   BinarySearch(n , s ,m-1,t);
        }
       return BinarySearch(n, m+1, e,t);

    }

}
