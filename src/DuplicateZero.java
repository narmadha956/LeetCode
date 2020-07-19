public class DuplicateZero {

    public static void duplicateZeros(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0)
                count = count + 1;

        }

        // Start backwards from the last element which would be part of new array.
        int last = (arr.length-1) - count;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + count] = 0;
                count--;
                arr[i + count] = 0;
            } else {
                arr[i + count] = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }
}
