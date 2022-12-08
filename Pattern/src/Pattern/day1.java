package Pattern;

public class day1 {

    public static void main(String[] args) {

     pattern1(5);
     pattern2(5);
     pattern3(5);
    }

    private static  void pattern1 (int n){


        for(int row = 1; row<=n; row++){

            for(int col = 1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }

    private static  void pattern2 (int n){


        for(int row = 1; row<=n; row++){

            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static  void pattern3 (int n){


        for(int row = 1; row<=n; row++){

            for(int col = n; col>row - 1; col--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
