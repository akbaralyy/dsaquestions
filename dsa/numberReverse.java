public class numberReverse {
    public static void main(String[] args) {
       int ans = reverse(254);
        System.out.println(ans);

    }
    static int reverse(int n){
        int result =0;
        if(n==0){
            return result;
        }


        result += ((n%10)*10)+ reverse(n/10);


        return result;
    }
}
