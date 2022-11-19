package Queue;

public class CustomQueue {
  private   int[] arr;
    private int front;
    private int rear;
    private int size;


   public CustomQueue (int i) {
        size = 10001;
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        return  front == rear;
    }

    void enqueue(int data) {

        arr[rear] = data;
        rear++;

    }

    int dequeue() throws Exception {
        if(isEmpty()){
            return -1;
        }

        int remove = arr[front];
        for (int i = 1; i < arr.length ; i++) {
            arr[i-1] = arr[i];
        }

        rear--;
        return remove;
    }

    int front() {
        return arr[front];
    }


}
