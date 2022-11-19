package BinaryTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1  -1
        BuildTree tree = new BuildTree();
//        Node root = null;
//        root = tree.buildTree(root);

        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(17);
        tree.levelOrderTraversal(tree.root);
        tree.reverseLevelOrder(tree.root);
//        tree.postOrder(tree.root);






//        Map< Integer, Boolean> map = new TreeMap < > ();
//
//      map.put(3,false);
//      map.get(3);
//        System.out.println(map.get(3));

    }

}
