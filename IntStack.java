public class IntStack {
    private int[] stack;
    private int top;

    public IntStack() {
        top = -1;
        stack = new int[50]; 
    }
    
    public IntStack(int size) {
        top = -1;
        stack = new int[size];
    }

    public boolean push(int number) {
        if(!isFull()) {
            top++;
            stack[top] = number;
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull() {
        return top == stack.length-1;
    }

    public int pop() {
        if(!isEmpty()) {
            int a = stack[top];
            top--;
            return a;
        }else {
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}