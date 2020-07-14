public class LinkedListStackDrive {
    public static void main(String[] args) {
        IntLinkStack stack = new IntLinkStack(4);
        stack.push(1);
        stack.push(3);
        stack.push(6);
        stack.push(8);
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}