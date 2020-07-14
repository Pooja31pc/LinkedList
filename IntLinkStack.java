public class IntLinkStack {
    private IntLinkedList list;

    public IntLinkStack(int value) {
        list =new IntLinkedList(value);
    }

    public void push(int number) {
        list.insertFirst(number);
    }

    public int pop() {
        return list.deleteFirst();
    }
}