package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void binarySearch() {
        int[] actual = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertEquals(1, Main.binarySearch(2, actual));
    }

    @Test
    void binarySearchEmpty() {
        int[] actual = {};

        assertEquals(-1, Main.binarySearch(9, actual));
    }

    @Test
    void binarySearchLastElement() {
        int[] actual = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        assertEquals(4, Main.binarySearch(1, actual));
    }

    @Test
    void binarySearchMiddleDifferent() {
        int[] actual = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2};

        assertEquals(4, Main.binarySearch(1, actual));
    }

    @Test
    void binarySearchMiddleWithZero() {
        int[] actual = {0, 0, 0, 0, 0};

        assertEquals(2, Main.binarySearch(0, actual));
    }

    @Test
    void binarySearchWithNegativeNumbers() {
        int[] actual = {-1, -5, -55, -555, -2141, -3221, -32321112};

        assertEquals(-1, Main.binarySearch(3, actual));
    }

    @Test
    public void testSingleElementArrayElementFound() {
        int[] array = {5};
        assertEquals(-1, Main.binarySearch(5, array));
    }

    @Test
    void binarySearchWithMiddleOfMiddle() {
        int[] actual = {2, 4, 6, 8, 10};
        assertEquals(2, Main.binarySearch(6, actual));
    }
}