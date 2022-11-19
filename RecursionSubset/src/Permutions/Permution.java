package Permutions;

public class Permution {
    public static void main(String[] args) {

        permututions("", "123");
    }

    static  void permututions (String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permututions(  f+ch+s, up.substring(1));
        }


    }

}
