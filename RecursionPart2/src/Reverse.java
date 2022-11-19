public class Reverse {

    public static void main(String[] args) {

        int num = 121;


        int numLength = String.valueOf(num).length();
        System.out.println();
//        for (int i = 0; i < numLength; i++) {
//            int start = num[i]
//
//        }

//        reverseNumber(1234);
//        System.out.println(sum);
    }
    static int sum = 0;
    static void reverseNumber (int n){
        if(n == 0){
            return;
        }
        int lastDigits = n % 10;
        sum = sum * 10 + lastDigits;
        reverseNumber(n/10);

    }

}
