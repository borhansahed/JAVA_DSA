public class targetValue {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 7, 10, 6, 9};
        int target = 10;



        System.out.println(targetValue(arr,target));

//        System.out.println(Arrays.toString(targetValue(arr,target)));
    }
    static int targetValue (int[] arr, int target){

         int element = target;

        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }


        return -1;
    }
}



