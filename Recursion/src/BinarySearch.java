public class BinarySearch {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,8,64};
        int target = 2;
        int start = 0;
        int end = arr.length -1;
        System.out.println(search(arr,target,start, end));
    }

    static  int search (int[] arr , int target, int start , int end){

        if(start > end){
            return -1;
        }
        int mid = start + (end - 2) /2;

        if(arr[mid] == target){
             return mid;
        }

        if(target < arr[mid]){
            return search(arr, target, 0 , mid-1);
        }
        return search(arr, target, mid+1, end);

    }
}
