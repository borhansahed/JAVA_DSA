public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,23,32,34,54,67,87,98,121,123,124,134};
        int target = 8;
        int ans = infiniteArray(arr,target);
        System.out.println(ans);
    }
    static int infiniteArray (int[] arr, int  target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end +1;
            end = end + (end - start+1) *2;
            start = newStart;
        }

        return binarySearch(arr , target , start ,end);

    }

    static int binarySearch(int[] nums , int target , int start , int end){


        while (start <= end){
            int mid = start + (end - start) /2;

            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else {
            return mid;
            }
        }
        return -1;

    }







}
