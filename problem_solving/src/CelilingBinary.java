public class CelilingBinary {
//ceiling search means get the smallest number greater or = target element; Ex: arr [1,2,3,4,5,6,7,10,12,13,14]; target = 8;
    // output will be 10; immidiate grater number in the array of target;
    public static void main(String[] args) {
//        int[] nums = {30,26,24,20,15,12,11,8,7,6,5,4,2,1};
        int[] nums = {2,4,6,7,8,12,14,16,18,24};
        int target = 19;
        System.out.println(ceilingSearch(nums, target));
    }
    static int ceilingSearch(int[] nums, int target) {

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
        if(isAsc){
            return start;
        }
        else {
            return end;
        }

}
}
