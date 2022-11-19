package searching;

public class Sqrt {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(sqrt(n));


    }

    static int sqrt(int x){
        int s = 1;
        int e = x;

        while(s<=e){

            int m = s + (e-s)/2;
            int ans = m*m;
            if(ans == x){
                return m;
            }
            if(x > ans){
                s = m+1;
            }else{
                e = m;
            }
        }
        if(e*e == x){
            return e;
        }

       return s-1;
    }

}
