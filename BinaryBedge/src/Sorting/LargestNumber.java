package Sorting;

public class LargestNumber {


    public static void main(String[] args) {
        int[] n = {3,30,34,5,9};
        String ans = largestNumber(n);
        System.out.println(ans);

    }
    static String largestNumber(int[] nums) {
       String ans = "";

        for (int i = 0; i < nums.length ; i++) {
            int lastNum = nums[nums.length-i-1];
            int lastDigit = lastNum % 10;

            if(lastDigit == 0 &&   nums[i] > lastDigit  ){
                int number = nums[nums.length-2-i];
               lastDigit =  number ;
               ans = ans + number + lastDigit;
            }else {
                ans = ans + lastNum;
            }

        }

       return ans;
    }
}
