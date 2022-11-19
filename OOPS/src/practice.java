import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] num = {1,2,4};

        System.out.println( cycle(num));
//        System.out.println(Arrays.toString();
    }
    static  int cycle (int[] num ){

        for (int i = 1; i <= num.length ; i++) {

            int correct = num[i] -1;
            if(num[i] != num[correct]){
               return i;
            }
        }
        return -1;
    }
}
