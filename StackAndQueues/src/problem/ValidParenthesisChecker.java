package problem;

import java.util.Stack;

public class ValidParenthesisChecker {


    public static void main(String[] args) {
        String s = "(])";
        System.out.println(checkValid(s));
    }

    static boolean checkValid(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                if(!stack.isEmpty()){
                    char p = stack.peek();
                    if((ch == ')' && p == '(') ||(ch == '}' && p == '{') || (ch == ']' && p == '[')){
                        stack.pop();

                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }

//        if(stack.isEmpty()){
//            return true;
//        }else{
//            return false;
//        }
       return stack.isEmpty();
    }
}
