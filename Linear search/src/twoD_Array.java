import java.util.Arrays;

public class twoD_Array {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4, 5, 6}, {7, 8, 9, 34}, {56, 78, 98}};
        int target = 2;
        int[] ans = arrayTwoD(arr, target);
        System.out.println(Arrays.toString(ans));
    }


    static int[] arrayTwoD (int[][] arr , int target){

        int element = target;
        if(arr.length == 0){
            return new int[] {-1};
        }
        for(int row = 0; row<arr.length; row++){


            for (int col = 0; col<arr[row].length; col++){

                if (arr[row][col]== element){

                    return new  int[] {row,col};
                }

            }

        }
        return new int[] {-1};
    }

}

