package SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SLL linkList = new SLL();

        linkList.insert(3);
        linkList.insert(4);
        linkList.insert(10);
        linkList.insertLast(12);
        linkList.insertLast(1);

////        System.out.println(linkList.deleteFirst());
//        linkList.display();
//        System.out.println(linkList.deleteFirst());
//        linkList.display();
        linkList.reverse();


    }
}
