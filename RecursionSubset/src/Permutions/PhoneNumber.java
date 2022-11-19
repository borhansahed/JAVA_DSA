package Permutions;

import java.util.ArrayList;

public class PhoneNumber {
    public static void main(String[] args) {
        ArrayList<String> ans = pad2("", "12");
        System.out.println(ans);
//        pad("" , "12");

    }
    static void pad(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digits = up.charAt(0) - '0';
        for (int i = (digits - 1) * 3; i < digits * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p+ch , up.substring(1));
 }
    }
    static ArrayList pad2(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        int digits = up.charAt(0) - '0';
        for (int i = (digits - 1) * 3; i < digits * 3; i++) {
            char ch = (char) ('a' + i);
           ans.addAll(pad2(p+ch , up.substring(1)));
        }
        return ans;
    }

}
