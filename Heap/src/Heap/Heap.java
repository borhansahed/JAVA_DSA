package Heap;

public class Heap {

   private int[] arr;
    private  int size = 0;
    Heap(){

        arr = new int[100];
        arr[0] = -1;


    }

    void insertion (int val){
        size = size +1;
        int index = size;
       arr[index] = val;
        while(index > 1){
          int parent = index /2;

          if(arr[index] > arr[parent]){
              int temp = arr[index];
              arr[index] = arr[parent];
              arr[parent] = temp;
              index = parent;
          }else{
              return;
          }
        }
    }

    void delete(){
        if(size == 0){
            System.out.println("No value available");
            return;
        }
        arr[1] = arr[size];
        size--;
         int i = 1;
         while (i < size){
             int leftNode = 2*i;
             int rightNode = 2*i+1;
             if(leftNode < size && arr[i] < arr[leftNode]){
                swap(arr,i,leftNode);
                 i = leftNode;
             } else if (rightNode < size && arr[i] < arr[rightNode]) {
                 int temp = arr[i];
                 arr[i] = arr[rightNode];
                 arr[rightNode] = temp;
                 i = rightNode;
             }else{
                 return;
             }
         }
    }

    void heapify (int[] arr , int n, int i){
        int largest = i;
        int leftNode = 2 * i+1;
        int rightNode = 2 * i +2;
        if(leftNode < n && arr[largest] < arr[leftNode]){
            largest = leftNode;
        }
        if(rightNode < n && arr[largest] < arr[rightNode]){
            largest = rightNode;
        }
        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n,largest);
        }
    }

    void heapSort (int[] arr , int n){



        for (int i = n/2 -1 ; i >= 0 ; i--) {
           heapify(arr,n , i);
        }

        int size = n -1;

        while( size  > 0){
            swap(arr,size,0);


            heapify(arr,size,0);
            size--;
        }
    }

  private   void swap (int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    void display(){
        for (int i = 1; i <= size ; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }
}
