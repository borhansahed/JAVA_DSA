import java.util.Arrays;

public class MountainArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4,3,1};
        System.out.println(indexMountainArray(arr));
    }


    static int  indexMountainArray (int[] arr) {



        int start = 0;
        int end = arr.length -1;

// start is not <= end
//because in the end start return ; we need broken our while loop . if we do start<=end our loop not break;
        while (start < end){
            int mid = start + (end - end) /2;


            if(arr[mid] > arr[mid+1]) {
                end = mid;
            }else{

                start = mid +1;
            }
        }
        return start;
    }



}
