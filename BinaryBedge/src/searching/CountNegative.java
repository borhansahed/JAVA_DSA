package searching;

public class CountNegative {

    public static void main(String[] args) {
         int[][] n = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

         int ans = negativeNumberCount(n);
        System.out.println(ans);
    }

    static int negativeNumberCount (int[][] grid){
        int count = 0;

        for (int row = 0; row < grid.length ; row++) {


            for (int col = 0; col < grid[row].length; col++) {

                if(grid[row][col] < 0){
                    count++;
                }
            }

        }



        return count;
    }
}
