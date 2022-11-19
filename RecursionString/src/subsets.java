import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        String a = "abc";
        System.out.println(subSet("",a));
    }
    static ArrayList<String> subSet (String p , String up){
        if(up.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSet(p+ch, up.substring(1));
        ArrayList<String> right = subSet(p, up.substring(1));
        ArrayList<String> third = subSet(p+(ch+0), up.substring(1));

        right.addAll(third);
        left.addAll(right);
        return left;
    }
}
