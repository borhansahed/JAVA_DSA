import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int n = 4;
        int k = 4;

       boolean ans = arraySortedOrNot(a , n );
        System.out.println(ans);
    }

   static boolean arraySortedOrNot(int[] arr, int n) {

       int start = arr[0];
       int last = n-1;

       if(start > last){
           return false;

       }
        for(int i = 1; i<n; i++){




            int mid = last - (last - start) /2;


            if(start == mid && start == last){
                return true;
            }

            if(arr[i] < arr[i-1]){
                return false;
            }


            if(mid < start){
                return true;
            }
        }
        return true;
    }
}
