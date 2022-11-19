package trie;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        Trie node = new Trie();
//        node.insert("geeikistest");
//        node.insert("geeksforgeeks");
//        node.insert("sahed");
//        node.insert("tea");
        String contact[] = {"geeikistest", "geeksforgeeks",
                "geeksfortest"};
        String s = "geeips";
        System.out.println(displayContacts(contact,s));
//        System.out.println(node.searchWord("tea"));

    }

   public static ArrayList<ArrayList<String>> displayContacts(
                                                        String contact[], String s)
    {


        Trie t = new Trie();

        // insert in trie
        for(int i = 0; i<contact.length; i++){
            t.insert(contact[i]);
        }


        return t.getSuggestions(s);


    }

}
