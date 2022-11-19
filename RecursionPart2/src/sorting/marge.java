package sorting;

import java.util.Arrays;

public class marge {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};

        System.out.println(Arrays.toString(merge(arr1,3, arr2,3)));

    }
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergeArr = new int [m+n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){

            if( nums1[i]< nums2[j] ){
                mergeArr[k] = nums1[i];

                i++;

            }else{
                mergeArr[k] = nums2[j];

                j++;
            }
            k++;
        }



         while(i < m){
             mergeArr[k] = nums1[i];
             k++;
             i++;
         }
          while(j < n){
             mergeArr[k] = nums2[j];
             k++;
             j++;
         }

        return mergeArr;
    }
}
