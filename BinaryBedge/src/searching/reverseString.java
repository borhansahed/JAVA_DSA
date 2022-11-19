package searching;

public class reverseString {

    public static void main(String[] args) {
        String str = "for";

        int n = str.charAt(0);
        int l = str.charAt(str.length()-1) ;
//        System.out.println((char) l);
        System.out.println(reverse(str));
    }

    static String reverse (String str){

        String ans = "";

        for (int i = 0; i < str.length(); i++) {

            int first = str.charAt(i);
            ans = (char)first + ans;

        }

        return ans;
    }
}
