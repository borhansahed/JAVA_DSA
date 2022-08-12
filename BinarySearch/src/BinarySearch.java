import java.util.Arrays;
// sorted array binarySearch
public class BinarySearch {

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9,12,13,23,34,56,78};
       int target = 2;
       int ans = binarySortTargetSearch(arr,target);
        System.out.println((ans));
    }

    static int binarySortTargetSearch(int[] arr , int target){

        int element = target;
        if(arr.length == 0){
            return -1;
        }
         int start = 0;
        // when you run for of array then you need to arr.length; if you store length of array in variable then you need to arr.length -1;
        // because arr is started by 0 index ;
        int end = arr.length-1;

        while (start <= end){

            // int mid = (start - end) / 2; not good practice because int have digits limition;
            int mid = start + (end- start) /2; // this good practice;

            if(arr[mid] < target){
               start = mid + 1;
            }else if(arr[mid] > target){
                end= mid - 1;
            }else {
                return mid;
            }

        }

        return -1;
    }
}
