public class IntLinkQueue {
    private IntLinkedList queue;
    
    public IntLinkQueue(int value) {
        queue = new IntLinkedList(value);
    }

    public void enqueue(int number) {
        queue.insertLast(number);
    }

    public int dequeue() {
        return queue.deleteFirst();
    }

    public void printQueue() {
        queue.printList();
    }

}