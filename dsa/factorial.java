public class factorial {
    public static void main(String[] args) {
        int n=3;
        System.out.println(factorial(n));

    }

   static int factorial(int n){
       if(n==0 || n==1){
           return 1;
       }else{
           return n * factorial(n-1);
       }

    }
}
