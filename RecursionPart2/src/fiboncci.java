public class fiboncci {

    public static void main(String[] args) {
        System.out.println(fibo(2));
    }
    static int fibo (int n){
        if(n == 0){
            return 0;
        }

        return fibo(n-1) + fibo(n-2);
    }

}
