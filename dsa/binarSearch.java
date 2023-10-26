public class binarSearch {
    public static void main(String[] args) {
        int []arr={1,4,6,6,17,};
        System.out.println(binarSearch(arr,0,8));
    }

    static boolean binarSearch(int [] arr, int index, int target){
        if(index==arr.length){
            return false;
        }

        return arr[index]==target || binarSearch(arr , index+1,target);
    }
}