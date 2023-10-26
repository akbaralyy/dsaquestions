public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 9, 12, 16};
        int target = 16;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        if (s <= e) {
            int m = (s + e) / 2;

            if (arr[m] == target) {
                return m;
            } else if (arr[m] > target) {
                return binarySearch(arr, target, s, m - 1);
            } else {
                return binarySearch(arr, target, m + 1, e);
            }
        }
        return -1;
    }
}
