package org.example.sort;

// in-place algorithm ( we use the original array, no new memory needed)
// O(n^2) time complexity - quadratic
// algorithm degrades quickly
public class BubbleSort {
    // 20,35,-15,7,55,1,-22
    // start with i=0
    // compare pairs of number and switch them if left one is
    // greater than right one
    // unsortedPartitionIndex = 6 - last index of the unsorted partition
    // after first iteration, unsortedPartitionIndex = 5

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int i=0;i<intArray.length;i++){
            System.out.print(intArray[i]+" ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
