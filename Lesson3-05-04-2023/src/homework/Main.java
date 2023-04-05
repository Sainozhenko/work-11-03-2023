package homework;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        int[] array = {1, 3, 2, 3, 4, 34, 43, 2, 1, 4, 3};
        System.out.println(binarySearch(n, array));

    }

    public static int binarySearch(int search, int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int middle = (start + end) / 2;
            if (search < array[middle]) {
                end = middle - 1;
            }
            if (search > array[middle]) {
                start = middle + 1;
            }
            if (search == array[middle]) {
                return middle;
            }

        }
        return -1;
    }
}