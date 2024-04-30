public class HW3 {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
    public static void main(String[] args) {
        int[] array = {3, 11, 6, 2, 9, 8, 5, 1, 13};
        insertionSort(array);
        for (int num : array) {
            System.out.println(num);
        }
    }
}
