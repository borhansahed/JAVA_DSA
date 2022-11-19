package problem;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {

        Stack<Integer> list1 = new Stack<>();

        list1.push(3);
        list1.push(2);
        list1.push(1);
        list1.push(7);
        list1.push(6);
        reverse(list1);
        System.out.println(list1);

    }
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()){
            return;
        }

        int num = s.peek();
        s.pop();

        reverse(s);
        insertBottom(s,num);
    }

    static void insertBottom(Stack<Integer> s , int num){
        if(s.isEmpty()){
            s.push(num);
            return;
        }

        int n = s.peek();
        s.pop();

        insertBottom(s,num);
        s.push(n);
    }
}
