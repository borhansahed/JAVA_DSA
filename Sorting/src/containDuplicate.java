public class containDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,45,6};
        System.out.println(checkDuplicate(nums));

    }
 static boolean checkDuplicate(int[] nums){


     for (int i = 0; i <nums.length; i++)
     {
         for(int j = i+1; j<nums.length; j++){

             if(nums[j] == nums[i]){
                 return true;
             }
         }
     }



     return false;



 }


}
