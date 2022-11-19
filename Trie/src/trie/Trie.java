package trie;

import java.util.ArrayList;

class TrieNode{
    char data;
    TrieNode[] children;
    boolean isTerminal;

    public TrieNode(char data) {
        this.data = data;
        this.children = new TrieNode[26];
        for (int i = 0; i < 26; i++) {
            children[i] = null;

        }
        isTerminal = false;
    }
}
public class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }
   void insertUtil(TrieNode root, String s){
           if(s.length() == 0){
               root.isTerminal = true;
               return;
           }

         int index = s.charAt(0) - 'a';
           char ch = s.charAt(0);
           TrieNode child;

           // if word is present in root;
       if(root.children[index] != null){
           child = root.children[index];
       }else{
           child = new TrieNode(ch);
           root.children[index] = child;
       }

       // recursion

       insertUtil(child, s.substring(1) );

   }

    public void insert (String s){
        insertUtil(root, s);
    }

   private boolean searchUtil(TrieNode root, String s){
        if(s.length()  == 0){

            return root.isTerminal;

        }

        int index = s.charAt(0) - 'a';
        TrieNode child;
        if(root.children[index] != null){
            child = root.children[index];
        }else {
            return false;
        }

        return  searchUtil(child, s.substring(1));

    }
   public boolean searchWord (String s){
        return searchUtil(root,s);
    }

    private void printSuggestion (TrieNode curr, ArrayList<String> temp, String s){

        if(curr.isTerminal == true){

            temp.add(s);
        }

        for(char ch = 'a'; ch<='z'; ch++){

            TrieNode next = curr.children[ch - 'a'];

            if(next != null){
                s+=ch;
                System.out.println("up" + "->" + s);

                printSuggestion(next, temp,s);
                s = s.substring(0,s.length() -1);
            }

        }
    }

    public ArrayList<ArrayList<String>> getSuggestions(String s){

        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        TrieNode prev = root;
        String prefix = "";

        for(int i = 0; i<s.length(); i++){

            char lastCh = s.charAt(i);

            prefix +=lastCh;

            TrieNode curr = prev.children[lastCh - 'a'];
            ArrayList<String> temp = new ArrayList<>();
            // not found
            if(curr == null){
                temp.add("0");
                ans.add(temp);
                return ans;
            }



            printSuggestion(curr, temp, prefix);

            ans.add(temp);
            temp.clear();

            prev = curr;
        }

        return ans;
    }


}
