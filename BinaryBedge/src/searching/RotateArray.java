package searching;

public class RotateArray {
    public static void main(String[] args) {
        int[] n = {4,5,6,7,0,1,2};
        int target = 1000000;
        System.out.println(sumOfSquare(target));

    }
//    static int findPivot (int[] c){
//        int s = 0;
//        int e = c.length -1;
//        int pivot = 0;
//        while (s <= e){
//            int m = s+(e-s) /2;
//            if (c[m] > c[m+1] && c[m] > c[m-1]){
//                pivot = m;
//                return pivot;
//
//            }
//            if(c[m] < c[m-1]){
//
//            }
//        }
//
//
//        return pivot;
//    }
    static boolean sumOfSquare (int c ){
       long s = 0;
       long e = c-1;
        while (s<= e){
            long m = s + (e - s) /2;

            if(m*m == c){
                return true;
            }
            if(m*m > c){
                e = m;
            }
            if((s*s) +( e*e) > c){
                e--;
            }else if((s*s) + (e*e) == c){
                return true;
            }else{
                 s--;
            }
        }

        return false;
    }

}
