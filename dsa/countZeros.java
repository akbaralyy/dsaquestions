public class countZeros {
    public static void main(String[] args) {
        int ans = 50405;
        System.out.println(countZeros(ans));

    }
    static int countZeros(int n){
        return helper(n , 0);
    }
   static int helper(int n , int c){
        if(n==0){
            return c;
        }else {
            int rem = n % 10;
            if (rem == 0) {
                return helper(n / 10, c + 1);
            }
            return helper(n / 10, c );
        }
   }

}
