public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 5, 3, 1, 8, 6, 4, 2, 9};
        sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }
}

