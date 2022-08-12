public class count {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,7,7,7,56,7};
        int target = 7;
        int ans = countNumber(arr, target);
        System.out.println(ans);
    }

    static int countNumber (int[] arr , int target){

            int count = 0;
        for(int i = 0; i<arr.length; i++){

            if (arr[i] == 7){

                count++;
            }
        }
        return count;
    }


}
