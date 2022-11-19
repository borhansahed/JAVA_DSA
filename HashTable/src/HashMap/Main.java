package HashMap;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put(1, 1);
        map.put(2,2);

        System.out.println(map.get(3));
//        map.put(2,2);
//        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.get(1));
        map.remove(2);
        System.out.println(map.get(2));

      
        HashSet<Integer> ans = new HashSet<>();

    }
}
