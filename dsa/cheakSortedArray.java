public class cheakSortedArray {
    public static void main(String[] args) {
    int []arr={1,4,6,6,17,};
        System.out.println(cheak(arr,0));
    }

    static boolean cheak(int [] arr, int index){
          if(index== arr.length-1 )
              return true;
        return arr[index]<=arr[index+1] && cheak(arr , index+1);
    }
}
