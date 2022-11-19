package Subsequence;

import java.util.ArrayList;
import java.util.List;

public class DiceRoll {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        dice("",3);
    }
    static  void dice (String p, int target){

        if(target == 0){
            System.out.println(p);
            return;
        }



        for (int i = 1; i <=6 && i <= target; i++) {
            dice(p + i , target - i);

        }




    }

}
