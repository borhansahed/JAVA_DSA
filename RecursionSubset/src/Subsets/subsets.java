package Subsets;

import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
//        sub("", "abc");
        System.out.println(sub2("","abc")) ;
        System.out.println(sub3("","abc")) ;
    }
    static void sub(String p , String s){

        if(s.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = s.charAt(0);

        sub(p+ch , s.substring(1));
         sub(p , s.substring(1));
        sub(p+(ch + 0) , s.substring(1));



    }
    static ArrayList<String> sub2(String p , String s){
        ArrayList<String> list = new ArrayList<>();
        if(s.isEmpty()){

            list.add(p);
            return list;
        }

        char ch = s.charAt(0);

        ArrayList<String> left = sub2(p+ch , s.substring(1));
        ArrayList<String> right = sub2(p , s.substring(1));

        left.addAll(right);


        return left;

    }
    static ArrayList<String> sub3(String p , String s){
        ArrayList<String> list = new ArrayList<>();
        if(s.isEmpty()){

            list.add(p);
            return list;
        }

        char ch = s.charAt(0);

        ArrayList<String> left = sub2(p+ch , s.substring(1));
        ArrayList<String> right = sub2(p , s.substring(1));
        ArrayList<String> third = sub2(p +(ch+0) , s.substring(1));
        left.addAll(right);
        left.addAll(third);


        return left;

    }
}
