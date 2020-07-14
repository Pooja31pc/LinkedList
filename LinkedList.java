public class LinkedList {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList(8);
            list.insertFirst(9);
            list.insertFirst(10);
            list.insertFirst(11);
            list.insertFirst(12);
            list.insertFirst(13);
            list.insertFirst(14);
            list.insertFirst(15);
            list.insertFirst(16);
            list.insertLastSlow(17);
            list.insertLast(18);
            
            list.printList();
            list.deleteFirst();
            list.deleteFirst();
            list.printList();
            System.out.print(list.searchList(17));
    }
}