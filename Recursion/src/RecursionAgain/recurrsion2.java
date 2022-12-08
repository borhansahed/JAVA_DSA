package RecursionAgain;

public class recurrsion2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};


        System.out.println(arraySum(arr,5));
    }

    private static  int arraySum (int[] arr, int n){
        if(n >= arr.length) return 0;

        return arraySum(arr, n+1) + arr[n];
    }
}
