import java.util.ArrayList;
import java.util.List;

public class NumberSubset {
    public static void main(String[] args) {
        int[] num = {1,2,3};
//        System.out.println(subsets(num));
//        List<List<Integer>> ans = subsets(num);
//
//
//        for (List<Integer> list : ans){
//            System.out.println(list);
//        }
        int n = 6 ;
        fibo(n);

        
    }

    static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }

        }

        return outer;
    }
    static void fibo (int n){


        int n1 = 0;
        int n2 = 1;
//        System.out.println(ans);
////        System.out.println(n2);
        for (int i = 2; i <= n; i++) {
            int ans = n1 + n2;
            n1 = n2;
            n2= ans;
            if(i == n){
                System.out.println(ans);
            }



        }

    }
}
