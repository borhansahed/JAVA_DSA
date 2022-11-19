package Subsets;

import java.util.ArrayList;
import java.util.List;

public class subset2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
    static  List<List<Integer>> subsets(int[] nums) {


        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;

        solve(nums,ans,output,index);
        return ans;
    }

   static void solve(int[] nums, List<List<Integer>> ans, List<Integer> output, int index ){

        if(index >= nums.length){
            ans.add(output);
            return;
        }

        // exclude
       solve(nums,ans,output,index+1);


        // include
        int element = nums[index];

        output.add(element);

       solve(nums,ans,output,index+1);
    }
}
