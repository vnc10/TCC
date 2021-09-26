package tcc;

public class BubbleSort {

    private int arr[];

    public BubbleSort(int[] array) {
        arr = array;
    }

    public int[] ordena() {
        int n = this.arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (this.arr[j - 1] > this.arr[j]) {
                    temp = this.arr[j - 1];
                    this.arr[j - 1] = this.arr[j];
                    this.arr[j] = temp;
                }

            }
        }
        return arr;
    }
}
