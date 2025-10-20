package Midterm;
public class Bubbleshort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) 
            break;
        }
    }

    public static void main(String[] args) {
        int[] list = {1, 4, 25, 12, 11, 90};
        bubbleSort(list);
        System.out.println("Sorted the array in the list: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}