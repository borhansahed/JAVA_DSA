public class FloorSortedArray {

    public static void main(String[] args) {

        long[] arr = {4,3,6,8,3,2,5,9};
        int n = 8;
        int x = 1;
        int ans = findFloor(arr , n , x);

        System.out.println(ans);


    }

    static int findFloor(long arr[], int n, long x)
    {
        int count = -1;
        for(int i = 0; i<n-1; i++){



            if(arr[i] <= x  ){
                count++;
            }

        }

        if(count == -1){
            return -1;
        }
        return count + 1 ;
    }
    }

