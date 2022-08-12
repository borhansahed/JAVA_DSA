import java.util.Arrays;

public class assending {
    public static void main(String[] args) {

       int  n = 8;
      int[] a= {0,8,0,1,1,1,0,0};
      assending(a,n);
        System.out.println(Arrays.toString(a));
    }
    static void assending (int a [], int n){


        for(int i= 0; i<n; i++){

            int last = n-i-1;
            int max = maxElement(a ,0,last);
            swap(a, max, last );
            }

        }
        static int maxElement(int[] arr , int start , int last ){
             int max = start;
            for(int i = start; i<=last; i++){
              if(arr[start]< arr[i]){
                  max = i;
              }

            }
            return max;
        }

        static void swap(int[] a , int start , int last){

        int temp = a[start];
        a[start] = a[last];
        a[last] = temp;

        }


    }

