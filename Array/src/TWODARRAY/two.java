package TWODARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class two {


    public static void main(String[] args) {


        int n[][] = new int[3][4];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {
                Scanner s = new Scanner(System.in);
                n[j][i] = s.nextInt();

            }

        }
        for(int i = 0; i<3; i++){
            System.out.println(Arrays.toString(n[i]));
        }


    }
}
