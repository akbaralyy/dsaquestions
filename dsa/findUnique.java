public class findUnique {
    public static void main(String[] args) {
      int [] arr = {1,1,3,4,3,4,8,9,9};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] arr){
        int unique=0;
        for(int n:arr){
            unique^=n;

        }
        return unique;

    }
}
