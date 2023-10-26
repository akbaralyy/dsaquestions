

class yclicSort {
    public static void main(String[] args) {
        int[] arr = {28, 26, 25, 23, 19, 17, 16, 14, 13, 9, 2};
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

