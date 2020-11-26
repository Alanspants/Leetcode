package sort;

public class quickSort {
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int medianOf3(int[] array, int left, int right) {
        int center = left + (right - left) / 2;
        if (array[left] > array[right]) swap(array, left, right);
        if (array[center] > array[right]) swap(array, center, right);
        if (array[center] > array[left]) swap(array, center, left);
        return array[left];
    }

    private static void recQuickSort(int[] array, int left, int right) {
        if (right <= left) return;
        else {
            int patition = patitionIt(array, left, right);
            recQuickSort(array, left, patition - 1);
            recQuickSort(array, patition + 1, right);
        }
    }

    private static int patitionIt(int[] array, int left, int right) {
        int i = left;
        int j = right + 1;
        int pivot = array[left];
        int size = right - left + 1;
        if (size >= 3) {
            pivot = medianOf3(array, left, right);
        }
        while (true) {
            while (i < right && array[++i] < pivot) {
            }
            while (j > left && array[--j] > pivot) {
            }
            if (i >= j) break;
            else swap(array, i, j);
        }
        swap(array, left, j);
        return j;
    }

    public static void sort(int[] array) {
        recQuickSort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {8, 2, 4, 1, 7, 3, 8, 0, 2, 3};
        sort(array);
        for (int i : array) System.out.println(i);
    }
}
