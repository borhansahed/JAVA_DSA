package Pattern;

public class RecursionPattern {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        System.out.println(rotateArr(arr, 0, arr.length-1, 4));

    }


    static int rotateArr (int[] n , int s , int e , int t){
        if(s > e) {
            return -1;
        }

        int m = s+(e-s) / 2;

        if(n[m] == t){
            return m;
        }

        if(  n[s]  <= n[m]){
         if(t >= n[s] && t <= n[m]){
         return  rotateArr(n , s , m-1 , t);
         }else{
             return rotateArr(n , m+1, e , t);
         }
        }


            if(n[m] <= t && t <= n[e]) {
                return rotateArr(n, m + 1, e, t);
            }
        return rotateArr(n , s , m-1 , t);
    }
}
