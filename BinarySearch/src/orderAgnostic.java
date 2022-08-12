public class SearchPosition {

    public static void main(String[] args) {
        int[] nums = {12,11,9,7,6,5,4,3,2,1};
//        int[] nums = {1,2,3,4,5,6,7,8};
        int target = 3;
        System.out.println(orderAgnostic(nums, target));
    }
    static int orderAgnostic(int[] nums, int target) {

        if(target == 0 || nums.length == 0){
            return 0;
        }
//        if (nums.length == 0){
//
//        return 1;
//    }
    int start = 0;
    int end = nums.length -1;

    boolean isAsc = nums[start] < nums[end];

        while (start <= end){
        int mid = start + (end - end) /2;

        if(nums[mid] == target){
            return mid;
        }
        if(isAsc){
            if(target < nums[mid]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }else {
            if(target < nums[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }




    }
        return -1;
}
}
