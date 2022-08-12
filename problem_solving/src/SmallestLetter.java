import java.util.Arrays;

public class SmallestLetter {

    public static void main(String[] args) {

        int[] arr = {-3,-1,3,4,6};
        int target = -2;


         int ans = smallestArray(arr, target);
        System.out.println(ans);
    }


    static int smallestArray(int[] nums, int target){

        if( nums.length == 0){
            return 0;
        }
        int start = 0;
        int end = nums.length -1;
        int lastNumber = nums.length - 1;

        while (start < end){
            int mid = start + (end - end) /2;

            if(target == nums[mid]){
                return mid;
            }
            if(target < nums[mid]){
                end = mid -1;

            }
            else if(target > nums[mid]) {
                start = mid + 1;
            }



        }
        if(target > nums[nums.length - 1]){
            return start + 1;
        }
        return start;

    }


}
