package searching;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] ans = firstAndLastPosition(arr, 7);
        System.out.println(Arrays.toString(ans));
    }

    static int[] firstAndLastPosition (int[] nums , int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] ans = {-1, -1};
       ans[0] = search(nums , target , true);
       ans[1] = search(nums , target , false);
        return ans;

    }
    static int search (int[] nums , int target, boolean firstElementSearch){

        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while (s <= e){

            int m = s + (e - s) / 2;

            if(target < nums[m] ){
                e = m-1;
            }else if( target > nums[m]){
                s = m +1;
            }else{
                ans = m;
                if(firstElementSearch){
                    e = m -1;
                }else {
                    s = m+1;
                }
            }

        }
        return ans;
    }
}
