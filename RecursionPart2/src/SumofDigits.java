public class SumofDigits {

    public static void main(String[] args) {
        System.out.println(sumRecursion(13220));
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

        if(n%10 == n){
            return n;
        }
        return (n % 10) * (sumRecursion(n /10));
    }


}
