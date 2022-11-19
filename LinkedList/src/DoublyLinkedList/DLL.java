package DoublyLinkedList;

import SingleLinkedList.SLL;

public class DLL {
     private Node head;


     public void insertFirst (int val){
         Node node = new Node(val);
         node.next = head;
         node.prev = null;
         if(head != null){
             head.prev = node;
         }
         head = node;
     }
     // count node

    public int countNode(){
        Node node = head;
        int count = 0;
        while(node != null){
            count++;
            node = node.next;
        }

        return count;
    }
    // deleteNode
    public Node deleteNode (int x){

         Node previous = get(x-1);
         previous.next = previous.next.next;

        Node node = head;
        while (node != null){
            System.out.print(node.val + "-> ");
            node = node.next;
        }
        System.out.println();
        return previous;
         }

    public Node get(int index) {
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

     // Display Doubly LinkedList

    public void display(){
         Node node = head;
         while (node != null){
             System.out.print(node.val + "-> ");
             node = node.next;
         }
        System.out.println();
    }


    private class Node{
          private int val;
          private Node next;
          private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
