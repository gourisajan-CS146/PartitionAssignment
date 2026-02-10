import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PartitionTest {

 /* Test Lomuto partition using a sorted array */
@Test
    public void lomutoSortedArrayTest() {
        int[] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};

        int pivotIndex = Partition.lomutoPartition(arr, 0, arr.length - 1);

        // elements before pivot should be smaller or equal
        for (int i = 0; i < pivotIndex; i++) {
            assertTrue(arr[i] <= arr[pivotIndex]);
        }

        // elements after pivot should be larger
        for (int i = pivotIndex + 1; i < arr.length; i++) {
            assertTrue(arr[i] > arr[pivotIndex]);
        }
    }
/* Test Lomuto partition using an empty array */
    
@Test
    public void lomutoEmptyArrayTest() {
        int[] arr = {};

        int pivotIndex = Partition.lomutoPartition(arr, 0, 0);

        assertEquals(-1, pivotIndex);
    }

   /* Test Lomuto partition using an unsorted array */
    @Test
    public void lomutoUnsortedArrayTest() {
        int[] arr = {84, 3, 7, 1, 9, 6, 2, 5};

        int pivotIndex = Partition.lomutoPartition(arr, 0, arr.length - 1);

        for (int i = 0; i < pivotIndex; i++) {
            assertTrue(arr[i] <= arr[pivotIndex]);
        }

        for (int i = pivotIndex + 1; i < arr.length; i++) {
            assertTrue(arr[i] > arr[pivotIndex]);
        }
    }

    // Hoare  

    @Test
    public void hoareSortedArrayTest() {
        int[] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};

        int splitIndex = Partition.hoarePartition(arr, 0, arr.length - 1);
        int pivot = arr[0];

        // left side should be smaller or equal to pivot
        for (int i = 0; i <= splitIndex; i++) {
            assertTrue(arr[i] <= pivot);
        }

        // right side should be greater or equal to pivot
        for (int i = splitIndex + 1; i < arr.length; i++) {
            assertTrue(arr[i] >= pivot);
        }
    }
/* Test Hoare partition using an empty array */
    @Test
    public void hoareEmptyArrayTest() {
        int[] arr = {};

        int splitIndex = Partition.hoarePartition(arr, 0, 0);

        assertEquals(-1, splitIndex);
    }

    /* Test Hoare partition using a sorted array */
    @Test
    public void hoareUnsortedArrayTest() {
        int[] arr = {84, 3, 7, 1, 9, 6, 2, 5};

        int splitIndex = Partition.hoarePartition(arr, 0, arr.length - 1);
        int pivot = arr[0];

        for (int i = 0; i <= splitIndex; i++) {
            assertTrue(arr[i] <= pivot);
        }

        for (int i = splitIndex + 1; i < arr.length; i++) {
            assertTrue(arr[i] >= pivot);
        }
    }
}



