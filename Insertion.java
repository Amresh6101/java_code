public class Insertion {
    // Insertion sort
    public static void sort1(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    // Selection sort
    public static void sort2(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int currentIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[currentIdx])
                    currentIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[currentIdx];
            arr[currentIdx] = temp;
        }
    }

    // Buuble sort
    public static void sort3(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 7, 8, 3, 4, 1, 2, 0, 18 };
        sort1(arr, arr.length);
        System.out.println("Insertion sort========");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        sort2(arr, arr.length);
        System.out.println("Selection sort======");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        sort3(arr, arr.length);
        System.out.println("Bubble sort======");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

}