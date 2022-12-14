public class SolvePattern {
    public static void main(String[] args) {
          pattern31(4);
          pattern28(5);
    }
    static void pattern31(int n){
        n = n-1;
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n ; row++) {
            for (int col = 0; col<= n; col++) {

                int everyIndex = 1+originalN - Math.min(Math.min(row , col) , Math.min(  n- row , n -col  ));
                System.out.print(everyIndex + " ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){

        for (int row = 0; row < 2 * n; row++) {
           int colNumber = row > n ? 2 * n - row: row;
           int numberOfSpecs = n - colNumber;

            for (int s = 0; s < numberOfSpecs; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < colNumber; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){

        for(int row = 0; row< (2*n); row++){

            int colNumber = row > n ? 2 * n - row : row;

            for(int col = 0; col< colNumber; col++){

                System.out.print("* ");
            }
            System.out.println();
        }

    } static void pattern4(int n){

        for(int row = 1; row<=n; row++){

            for(int col = 1; col<=row; col++){

                System.out.print(col + " ");
            }
            System.out.println();
        }

    } static void pattern3(int n){

        for(int row = 1; row<=n; row++){

            for(int col = 1; col<=n-row+1; col++){

                System.out.print("* ");
            }
            System.out.println();
        }

    } static void pattern2(int n){

        for(int row = 1; row<=n; row++){

            for(int col = 1; col<=n; col++){

                System.out.print("* ");
            }
            System.out.println();
        }

    } static void pattern1(int n){

        for(int row = 1; row<=n; row++){

            for(int col = 1; col<=row; col++){

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
