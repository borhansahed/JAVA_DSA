package Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;


    private int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

   public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push (int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;

        return true;
    }
    public int pop () throws Exception {
        if(isEmpty()){
           throw new Exception("Stack is Empty. Push First Then PoP");

        }

       int remove = data[ptr];
        ptr--;

        return remove;
    }
    public int peek () throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty. Can't peek");

        }
         return data[ptr];
    }


    public boolean isFull() {
       return ptr == data.length-1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }
}
