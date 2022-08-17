public class SumofDigits {

    public static void main(String[] args) {
        System.out.println(sumRecursion(13));
    }

    static int sum (int n) {
         int sum = 0;
        while(n > 0){
            int digits = n % 10;
            sum += digits;
            n = n / 10;
        }
        return sum;
    }
    static int sumRecursion (int n){

        if(n == 0){
            return 0;
        }
        return (n % 10) + (sumRecursion(n /10));
    }

}
