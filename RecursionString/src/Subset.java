public class Subset {
    public static void main(String[] args) {
        String a = "bbccapple";
        String ans = removeChar(a);
//        System.out.println(ans);
        String p = "(){}}{";
//        for (int i = 0; i < p.length(); i++) {
////           String first = String.valueOf(a.charAt(i));
//            System.out.println(p.charAt(i) + 0);
//        }

        System.out.println(parentheses(p));
    }

    static String removeChar( String a){
        if(a.isEmpty()){
            return "";
        }

        if(a.startsWith("apple")){
            return removeChar(a.substring(5));
        }else {
            return a.charAt(0) + removeChar(a.substring(1));
        }
    }
    static boolean parentheses (String a){


        if(a.length() == 1|| a.length() == 0){
            return false;
        }

        for (int i = 0; i < a.length() /2; i++) {
            int first = a.charAt(i);
            boolean plus2 = first > 90;
            int last = a.charAt(a.length() - 1-i );

            if(plus2 && last != last-1 || !plus2 &&  last != last-1){
                return false;
            }
            if(plus2 && first+2 == a.charAt(i+1) || !plus2 && first+1 == a.charAt(i+1)){
                return true;
            }
            if( plus2 && first+2!= last){
               return false;
            }else if(!plus2 && first+1 != last){
                return false;
            }
        }
        return true;
    }
}
