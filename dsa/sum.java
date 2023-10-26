public class sum {
    public static void main(String[] args) {
        int n = 256;
        System.out.println(sum(n));

    }
    static int sum(int n){
       if(n==0){
           return  0;
       }
       return n%10 + sum(n/10);
    }
}
