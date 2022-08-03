public class functionMethod {

    public static void main(String[] args) {
       int a = 30;
       int b = 39;
        sum(a, b);

    }
    static  void sum (int n1 , int n2){

        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n1 + " " + n2);

    }


}
