public class floorBinary {
    //floor search means get the greatest number smaller or = target element; Ex: arr [1,2,3,4,5,6,7,10,12,13,14]; target = 8;
    // output will be 7; immidiate smaller number in the array of target;
    public static void main(String[] args) {
        int[] nums = {12,11,9,7,6,5,4,2,1};
//        int[] nums = {1,2,4,5,16,17,18};
        int target = 14;
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
            return end;
        }
        else {
            return start;
        }

    }
}
