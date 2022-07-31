import java.util.Scanner;

public class Main {

    public static void  main (String[] args){

//        System.out.print("enter a number");
        Scanner input = new Scanner(System.in);
//        int rollNumber = input.nextInt();
        String name = input.nextLine();
        float marks = input.nextFloat();


        System.out.println(name);
        System.out.println(marks);
    }
}