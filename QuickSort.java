public class QuickSort {
    public static int findpivot(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = 0; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap with element
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void part(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = findpivot(arr, low, high);
            part(arr, low, pivot - 1);
            part(arr, pivot + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 9, 2, 7, 8, 0, 3 };
        int n = arr.length;
        part(arr,0, n - 1);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
