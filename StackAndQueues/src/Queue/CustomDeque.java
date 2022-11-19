package Queue;

public class CustomDeque {
    private int[] arr;
    private int size;
    private int front = -1;
    private int rear = -1;
    private static final int DEFAULT_SIZE = 5;
    public CustomDeque() {
       this(DEFAULT_SIZE);
    }
  public CustomDeque(int n) {
        this.size = n;
        arr = new int[n];
    }

    public boolean isFull (){
       return front == 0 && rear == size-1 || rear == (front-1) % (size -1);
    }
    public boolean isEmpty (){
        return front == -1;
    }
    public boolean pushFirst (int data) throws Exception {
        if(isFull()){
           throw new Exception("Queue is full");
        } else if (isEmpty()) {
             front = 0;
             rear = 0;
        } else if (front == 0 && rear != size -1) {
            front = size -1;
        }else{
            front--;
        }
        arr[front] = data;
        return true;
    }
    public boolean pushLast (int data) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full");
        }
        else if(rear == size-1 && front != 0) {
            rear = 0;
        }else{
            rear++;
        }
        arr[rear] = data;
        return true;
    }
    public int popFirst () {
        if(isEmpty()) {
            return -1;
        }

        int remove = arr[front];
        arr[front] = -1;
        if (front == rear) {
            front = -1 ;
            rear = -1;
        }else if(front == size -1 && rear != 0){
            front = 0;
        }else{
            front++;
        }
        return remove;
    }
    public int popLast () {
        if(isEmpty()){//to check queue is empty

            return -1;
        }

        int ans = arr[rear];
        arr[rear] = -1;

        if(front == rear) { //single element is present
            front = rear = -1;
        }
        else if(rear == 0) {
            rear = size-1; //to maintain cyclic nature
        }
        else
        {//normal flow
            rear--;
        }
        return ans;
    }

    public void display() throws Exception {
       if(isEmpty()){
           throw new Exception("Queue is Empty");
       }
        System.out.println();
       int i = front;
        do {

           System.out.print(arr[i] + " -> ");
           i++;

      }while ( i <= rear  );
        System.out.println();
    }

}

