package BinaryTree;

import java.io.InputStream;
import java.util.*;

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
public class BuildTree {
      Node root;
    public Node buildTree(Node root){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your data");
        int data = input.nextInt();
        root = new Node(data);

        if(data == -1){
            return null;
        }

        System.out.println("Insert your left side node"+" " +  data);
        root.left = buildTree(root.left);
        System.out.println("Insert your right side node" + "" + data);
        root.right = buildTree(root.right);


        return root;
    }

    void levelOrderTraversal (Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node temp = q.element();
            q.remove();

            if(temp == null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else {
                System.out.print(" "+temp.data + " ");
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }


        }
        System.out.println();

    }

    void reverseLevelOrder (Node root){
        Stack<Node> S = new Stack();
        Queue<Node> Q = new LinkedList();
        Q.add(root);

        while(!Q.isEmpty()){
            Node temp = Q.peek();
            Q.remove();
            S.push(temp);

            if(temp.left != null){
                Q.add(temp.left);
            }
            if(temp.right != null){
                Q.add(temp.right);
            }
        }

        while (!S.isEmpty()){
            Node temp = S.peek();
            System.out.print(temp.data +" -> ");
            S.pop();
        }
    }

    void inOrder (Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data +" -> ");
        inOrder(root.right);
    }
    void preOrder (Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data +" -> ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder (Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" -> ");
    }





}
