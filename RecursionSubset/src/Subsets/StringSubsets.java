package Subsets;

import java.util.Arrays;

public class StringSubsets {
    public static void main(String[] args) {
//      String ans =  remove( "baccayty");
        int[] n = {3,4,6,2,1};
        bubbleSort(n , 0,n.length-1);


        System.out.println(Arrays.toString(n));
    }

    static void pattern (int row , int col){
        if(row == 5){
            return;
        }
        if(col < row){

            System.out.print('*');
         pattern(row , col+1);

        }else{
            System.out.println();
            pattern(row+1 , 0);
        }


    }
  static  String remove (String s){

        if(s == ""){
            return "";
        }


      char ch = s.charAt(0);
      if(ch == 'a'){

          return remove( s.substring(1));

      }



          return ch + remove( s.substring(1));



  }
  static void bubbleSort (int[] n , int s , int e){
        if(e == 0){
            return;
        }
        if(s < e){
            if(n[s] > n[e]){
                int temp = n[s];
                n[s] = n[e];
                n[e] = temp;
        }
            bubbleSort(n ,s+1 , e);
        }else{
            bubbleSort(n , 0, e-1);
        }
  }

}
