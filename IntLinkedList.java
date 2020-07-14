public class IntLinkedList {
    private Node head;
    private Node rear;
    public IntLinkedList(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        this.head = newNode;
        this.rear = newNode;
    }

    public void insertFirst(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;
        this.head = newNode;
    }

    public int deleteFirst() {
       int a = this.head.value;
        this.head = head.next;
        return a;
    }
    public void insertLast(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public void insertLastSlow(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        this.rear = newNode;
    }

    public boolean searchList(int value) {
        Node temp = head;
        while(temp!=null) {
            if(value == temp.value)
             return true;
             temp = temp.next;
        }
        return false;
    } 

    public void printList() {
        Node temp = head;
        while(temp!=null) {
           int value = temp.value;
        System.out.print(value+" --> ");
        temp = temp.next;
        }
        System.out.println();
    }
}