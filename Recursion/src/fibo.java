public class fibo {
    public static void main(String[] args) {
        System.out.println(fiboN(3));
    }

    static int fiboN (int n){

        if(n < 2){
            return n;
        }

        return fiboN(n-1) + fiboN(n-2);
    }
}
