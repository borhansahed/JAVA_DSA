package Queue;

public class CircularQueue {
    private int[] arr;
    private int front = 0;
    public static final int DEFAULT_SIZE = 10;
    private int rear = -1;
    private int size = 0;


    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.arr = new int[size];

    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        return size == 0;
    }
    boolean isFull() {
        return size == arr.length;
    }

    boolean enqueue(int data) throws Exception {
         if(isFull()){
             throw new Exception("Queue is full");
         }
         rear++;
         arr[rear] = data;
         rear = rear % arr.length;
         size++;
         return true;
    }

    int dequeue() throws Exception {
        if (isEmpty()) {
           throw new Exception("Queue is Empty");
        }

        int remove = arr[front++];
        front = front % arr.length;
        size--;
        return remove;
    }
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
    void display(){
        int i = front;
        do {
            System.out.print(arr[i] + " -> ");
            i++;

        }while (i<= rear);
        System.out.println("ENd");
    }

    int front() {
        return arr[front];
    }
}

