package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
   Node right;


    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BST {
   Node root;
    public Node insertBST(Node root, int data) {
          if(root == null){
              root = new Node(data);
              return root;
          }

          if( root.data > data){
              root.left =  insertBST(root.left , data);
          }
        else{
              root.right = insertBST(root.right , data);
        }
           return root;
    }
    void levelOrderTraversal (Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);


        while (!q.isEmpty()){
            Node temp = q.element();
            System.out.print(" "+temp.data + " ");
            q.remove();



                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }


        }




    Node deleteBST (Node root, int val){
        // base case
        if(root == null){
            return root;
        }

        if(root.data == val){
            if(root.left == null && root.right == null){
                root = null;
                return root;

            }
            // one child
            if(root.left!= null && root.right == null){
                Node temp = root.left;
                root = null;
                return temp;
            }
            if(root.left == null && root.right != null){
                Node temp = root.right;
                root = null;
                return temp;
            }

            // two child
            if(root.left != null && root.right != null){
                int min = minVal(root.right).data;
                root.data = min;
               root.right = deleteBST(root.right,min);
                return root;
            }
        } else if (root.data > val) {
           root.left = deleteBST(root.left,val);
           return root;
        }
        else{
           root.right = deleteBST(root.right, val);
            return root;
        }

        return root;
    }

    private Node minVal(Node root) {
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }
    int countNode (Node root){

        if(root == null){
            return 0;
        }

      int left = countNode(root.left);
        int right = countNode(root.right);
        return left+right+1;

    }
    void inOrder(Node root){

        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

}
