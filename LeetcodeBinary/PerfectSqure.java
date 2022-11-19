public class PerfectSqure {
    public static void main(String[] args) {
      
       int n = 16;
        // validSquare2(n);
          System.out.println(validSquare(n));
    }

    static boolean validSquare(int num){
        
        
        int s = 1;
        int e = (1<<31-1);
        while(s<=e){
        int m = s + (e-s)/2;
        long ans = (long)m*m;
        if(ans == (long)num){
            return true;
        }else if((long)num > ans){

            s = m + 1;

        }else{
            e = m-1;
        }

        }
        if((long)e*e == (long)num){
            return true;
        }

      return false;
    }
    static void validSquare2(int n){
        for(int i = 1; i<=n; i++){

            System.out.println(i);

            // if(i * i == n){
            //     return true;
            // }
        }

      
    }

}
