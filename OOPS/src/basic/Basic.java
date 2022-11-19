package basic;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args){
        Student one = new Student(12,"sahed");
        Student e = new Student();
//        System.out.println(e.f);
        int[] n1= {1,2,4,5};
        int[] n2 = {3,2,1,7,4,6,5};
//        cycle(n1,0 ,n2,0);

        System.out.println(Arrays.toString(n2));

    }
    static class Student{
        int f;
        String n;
        Student (int f , String n){
            this.f = f;
            this.n = n;

        }
        Student (){


        }
    }

    }










