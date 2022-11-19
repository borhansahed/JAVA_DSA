package BinarySearchTree;


import java.awt.*;
import java.util.ArrayDeque;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        BST  node = new BST();


      int[] values = {4,5,6,3,2,1};
        for (int i = 0; i < values.length; i++) {
           node.root = node.insertBST(node.root,values[i]);
        }
//        node.levelOrderTraversal(node.root);
//        node.root =node.deleteBST(node.root,3);
//        System.out.println();
//        node.levelOrderTraversal(node.root);
//        System.out.println(  node.countNode(node.root));
//        node.inOrder(node.root);

//        for (int i = size -1 ; i >=0 ; i--) {
//            System.out.print(list.get(i) + " ");
//        }
  node.levelOrderTraversal(node.root);
        node.inOrder(node.root);



    }




}
