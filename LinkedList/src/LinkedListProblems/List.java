package LinkedListProblems;

import java.util.ArrayList;

class ListNode{
    protected int val;
    protected ListNode next;
   public ListNode (){

    }

    public ListNode(int value) {
        this.val = value;
    }

    public ListNode(int value, ListNode next) {
        this.val = value;
        this.next = next;
    }
}


public class List  {

    private ListNode head;

    //     remove from duplicate
//    public void deleteDuplicates() {
//        ListNode curr = head;
//          ListNode prev = null;
//          ListNode next = curr.next;
//
//        while(curr != null){
//            if( curr.next != null && curr.next.val == curr.val){
//                prev.next = next.next;
//            }else {
//                prev = curr;
//                curr = next;
//                if(next != null){
//                    next = next.next;
//                }
//            }
//        }
//
//
//    }

    public void insert(int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

    }
    public void insertLast(int val){
        ListNode node = new ListNode(val);

        if(head == null){
          insert(val);
          return;
        }
        ListNode last = head;

       node.next = null;
       while (last.next != null){
           last = last.next;
       }
       last.next = node;

    }



    public ListNode midValue (ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }


        return slow;
    }
    // isPalindrome
    public boolean isPalindrome () {

        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
       return isTrue(list);
    }

    private boolean isTrue(ArrayList<Integer> list) {
        int n = list.size();
        int i = 0;
        int e = n-1;

        while (i <= e){
            if(list.get(i) != list.get(e)){
                return false;
            }
            i++;
            e--;
        }
        return true;
    }


    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = curr.next;

        while(curr != null){
            curr.next = curr;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }

        }
        return prev;
    }

    public void display (){
        ListNode node = head;
        while (node != null){
            System.out.print(node.val + "-> ");
            node = node.next;
        }
        System.out.println("END");
    }

}


