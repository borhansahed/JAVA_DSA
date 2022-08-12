public class SortMaxToMInBinarySearch {
    public static void main(String[] args) {


        int[] arr = {78,67,45,34,23,12,9,8,7,6,5,4,3,2,1};
        int target = 67;
        int ans = binarySortTargetSearch(arr,target);
        System.out.println((ans));



    }

    static int binarySortTargetSearch(int[] arr , int target){


        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        // when you run for of array then you need to arr.length; if you store length of array in variable then you need to arr.length -1;
        // because arr is started by 0 index ;
        int end = arr.length-1;

        while (start <= end){

            // int mid = (start - end) / 2; not good practice because int have digits limitation;
            int mid = start + (end- start) /2; // this good practice;

            if(target > arr[mid]){
                end = mid - 1;
            }else if(target< arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }

        }

        return -1;
    }



}
