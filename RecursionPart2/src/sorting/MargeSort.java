package sorting;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};

        System.out.println(Arrays.toString( margeSort(arr)));
    }

    static int[] margeSort (int[] arr){
        if(arr.length == 1){

            return arr;
        }
        int mid = arr.length /2;
        int[] first = margeSort(Arrays.copyOfRange(arr,0, mid));
        int[] last = margeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return marge(first, last);
    }
    static int[] marge(int[] first , int[] last){

        int[] margeArr = new int[first.length + last.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j< last.length){
            if(first[i] < last[j]){
                margeArr[k] = first[i];
                i++;
            }else{
                margeArr[k] = last[j];
                j++;
            }
            k++;
        }

        while(i < first.length){

            margeArr[k] = first[i];
            k++;
            i++;
        }
        while(j < last.length){

            margeArr[k] = last[j];
            k++;
            j++;
        }
        return margeArr;
    }


}
