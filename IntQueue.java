public class IntQueue {
    private int[] queue;
    private int front;
    private int rear;
    //private int size;
    private int total;

    public IntQueue() {
        front = 0;
        rear = 0;
        //size = 50;
        total = 0;
        queue = new int[50]; 
    }
    
    public IntQueue(int size) {
        front = 0;
        rear = 0;
        total = 0;
       // this.size = size;
        queue = new int[size];
    }

    public boolean enqueue(int number) {
        if(!isFull()) {
            total++;
            queue[rear] = number;
            rear++;
            //System.out.println("total"+total);
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull() {
        return rear == queue.length;
    }

    public int dequeue() {
        if(!isEmpty()) {
            //System.out.println("totla"+total);
            /=-System.out.println("f"+front);
            int a = queue[front];
            front++;
            total--;
            return a;
        }else {
            return 0;
        }
    }

    public boolean isEmpty() {
        return total == 0;
    }
}