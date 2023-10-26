//import java.util.Arrays;
//
//public class QuickSort {
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 7, 3, 77, 37, 75};
//        int[] sortedArr = quickSort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(sortedArr));
//    }
//
//    static int[] quickSort(int[] nums, int low, int high) {
//        if (low >= high) {
//            return nums;
//        }
//        int s = low;
//        int e = high;
//        int m = s + (e - s) / 2;
//        int pivot = nums[m];
//        while (s <= e) {
//            while (nums[s] < pivot) {
//                s++;
//            }
//            while (nums[e] > pivot) {
//                e--;
//            }
//            if (s <= e) {
//                int temp = nums[s];
//                nums[s] = nums[e];
//                nums[e] = temp;
//                s++;
//                e--;
//            }
//        }
//        quickSort(nums, low, e);
//        quickSort(nums, s, high);
//        return nums;
//    }
//}
//
