import java.util.Arrays;

public class BubbleSort {

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            // For each step, the max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // Swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred, the array is sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 6, 7, 3, 2};
        bubble(arr);

        // Print sorted array to verify the result
        System.out.println(Arrays.toString(arr));
    }
}
